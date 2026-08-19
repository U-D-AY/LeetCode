import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    // Memoization table: maps 'n' to its list of valid parentheses combinations
    private Map<Integer, List<String>> memo = new HashMap<>();

    public List<String> generateParenthesis(int n) {
        // Base case: 0 pairs means an empty string
        if (n == 0) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // Return cached result if already calculated
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        List<String> result = new ArrayList<>();

        // Deconstruct the problem: ( Left ) Right
        // Left has 'i' pairs, Right has 'n - i - 1' pairs
        for (int i = 0; i < n; i++) {
            List<String> leftList = generateParenthesis(i);
            List<String> rightList = generateParenthesis(n - i - 1);

            // Cross-multiply results from both subproblems
            for (String left : leftList) {
                for (String right : rightList) {
                    result.add("(" + left + ")" + right);
                }
            }
        }

        // Cache the result for the current 'n'
        memo.put(n, result);
        return result;
    }
}
