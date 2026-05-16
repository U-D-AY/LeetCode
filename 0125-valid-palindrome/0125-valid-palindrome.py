class Solution:
    def isPalindrome(self, s: str) -> bool:
        l = [i.lower() for i in s.strip() if i.isalnum()]
        print(l)
        return l == l[::-1]