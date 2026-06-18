class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:
        y = abs((minutes / 5) - (hour + minutes/60))

        return 30 * min(y, 12 - y)