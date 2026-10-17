class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x
        
        left, right = 1, x // 2
        ans = 0
        
        while left <= right:
            mid = left + (right - left) // 2
            
            # Use mid <= x // mid to avoid potential overflow in other languages,
            # though Python handles arbitrarily large integers automatically.
            if mid == x // mid:
                return mid
            elif mid < x // mid:
                ans = mid       # mid is a potential candidate, save it
                left = mid + 1  # try to find a larger valid integer
            else:
                right = mid - 1 # mid is too large, search the lower half
                
        return ans