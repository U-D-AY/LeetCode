class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        res = []
        seen = set()
        c = 0

        for i, j in zip(A,B):
            if i in seen:
                c+=1
            else:
                seen.add(i)
            
            if j in seen:
                c+=1
            else:
                seen.add(j)

            res.append(c)

        return res


