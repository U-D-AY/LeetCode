class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:

        m = minutes / 5
        h = (hour + minutes/60)
        y = abs(m - h)

        return 30 * min(y, 12 - y)