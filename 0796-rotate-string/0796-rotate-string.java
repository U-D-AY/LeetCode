class Solution {
    public boolean rotateString(String s, String goal) {
        int l1 = s.length();
        int l2 = goal.length();
        boolean y = (s + s).contains(goal);
        if(l1==l2 && y)
            return true;
        return false;
    }
}