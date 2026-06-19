class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        high = 0
        s = 0
        for i in gain:
            s += i
            if s>high:
                high = s
        
        return high