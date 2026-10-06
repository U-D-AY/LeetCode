class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            
            // Move pointer forward as long as numbers are consecutive
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            
            // Format the range based on whether it has single or multiple elements
            if (start == nums[i]) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + nums[i]);
            }
        }
        
        return result;
    }
}