class Solution:
    def rotatedDigits(self, n: int) -> int:
        c = 0
        for i in range(1, n+1):
            i = str(i)
            if '3' in i or '7' in i or '4' in i:
                    continue
            if '2' in i or '5' in i or '6' in i or '9' in i:
               c += 1

        return c