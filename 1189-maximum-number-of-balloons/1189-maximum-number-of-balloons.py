class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        c = Counter(text)
        return min(c.get(char, 0) // req for char, req in {'b':1, 'a':1, 'l':2, 'o':2, 'n':1}.items())