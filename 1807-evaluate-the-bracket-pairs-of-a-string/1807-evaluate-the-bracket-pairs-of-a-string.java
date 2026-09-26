class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        
        StringBuilder res = new StringBuilder();
        StringBuilder currentKey = new StringBuilder();
        boolean isKey = false;
        
        // Step 2: Traverse string character by character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                isKey = true;
            } else if (c == ')') {
                isKey = false;
                String key = currentKey.toString();
                // Step 3: Look up key or default to "?"
                res.append(map.getOrDefault(key, "?"));
                currentKey.setLength(0); // clear buffer
            } else {
                if (isKey) {
                    currentKey.append(c);
                } else {
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}