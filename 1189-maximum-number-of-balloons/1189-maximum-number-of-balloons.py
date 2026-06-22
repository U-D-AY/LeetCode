class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        c = Counter(text)
        m = float('inf')
        for i, j in {'b':1, 'a':1, 'l':2, 'o':2, 'n':1}.items():
            m = min(c.get(i, 0)// j, m)
        
        return m