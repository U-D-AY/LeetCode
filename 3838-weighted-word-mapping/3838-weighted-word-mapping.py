import string
class Solution:
    def mapWordWeights(self, words: List[str], weights: List[int]) -> str:
        d = { letter:i for i, letter in enumerate(string.ascii_lowercase)}
        d2 = { i:letter for letter, i in zip(string.ascii_lowercase, range(25, -1, -1))}
        
        s = ""
        for i in words:
            n = 0
            for j in i:
                n += weights[d[j]]
            s += d2[n%26]
        
        return s
