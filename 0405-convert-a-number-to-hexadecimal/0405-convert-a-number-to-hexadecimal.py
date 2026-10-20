class Solution:
    def toHex(self, num: int) -> str:
        if num == 0:
            return "0"

        # Handle 32-bit unsigned representation
        num &= 0xFFFFFFFF
        hex_chars = "0123456789abcdef"
        res = []
    
        while num > 0:
          res.append(hex_chars[num & 0xF])
          num >>= 4
    
        return "".join(res[::-1])