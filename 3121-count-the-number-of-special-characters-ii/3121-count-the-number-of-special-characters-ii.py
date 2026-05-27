class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        s = set()
        r = set()

        for i in word:
            if i.islower():
                x = i.upper()
                if x in s:
                    r.discard(x)
            else:
                if i not in s and i.lower() in s:
                    r.add(i)
            s.add(i)
        
        return len(r)