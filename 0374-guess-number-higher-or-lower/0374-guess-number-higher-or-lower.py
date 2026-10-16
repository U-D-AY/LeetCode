# The guess API is already defined for you.
# @param num, your guess
# @return -1 if num is higher than the picked number
#          1 if num is lower than the picked number
#          otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        low = 1
        high = n
        
        while low <= high:
            # Avoid potential integer overflow in languages like Java/C++
            mid = low + (high - low) // 2 
            res = guess(mid)
            
            if res == 0:
                return mid  # Found the secret number
            elif res == -1:
                high = mid - 1  # Guess was too high, search the lower half
            else:
                low = mid + 1   # Guess was too low, search the upper half
                
        return -1