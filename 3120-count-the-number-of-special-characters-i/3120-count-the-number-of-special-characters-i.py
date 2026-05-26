class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        v = set()
        c = 0
        for i in word:
            if i in v:
                continue
            if i.isupper():
                if i.lower() in v:
                    c+=1
            else:
                if i.upper() in v:
                    c += 1
            v.add(i)
        
        return  c


