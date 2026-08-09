import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // Count available digit frequencies
        int[] pool = new int[10];
        for (int digit : digits) {
            pool[digit]++;
        }

        List<Integer> validNumbers = new ArrayList<>();

        // Loop through all potential 3-digit even numbers
        for (int num = 100; num < 1000; num += 2) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int units = num % 10;

            // Check requirements against the digit pool
            pool[hundreds]--;
            pool[tens]--;
            pool[units]--;

            if (pool[hundreds] >= 0 && pool[tens] >= 0 && pool[units] >= 0) {
                validNumbers.add(num);
            }

            // Backtrack frequencies for the next iteration
            pool[hundreds]++;
            pool[tens]++;
            pool[units]++;
        }

        // Convert the list to a primitive array
        return validNumbers.stream().mapToInt(i -> i).toArray();
    }
}
