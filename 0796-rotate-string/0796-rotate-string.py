class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if len(s) != len(goal):
            return False
        if s==goal: return True

        t = goal[0]
        for i, j in enumerate(s):
            if j == t:
                if goal == s[i:] + s[:i]:
                    return True
        return False