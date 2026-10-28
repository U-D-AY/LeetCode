class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        chars = list(s)
        
        # Jump 2k steps at a time
        for i in range(0, len(chars), 2 * k):
            # Reverse the first k characters of the current 2k block
            chars[i : i + k] = reversed(chars[i : i + k])
            
        return "".join(chars)