class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        dic = Counter(arr)
        l=[]
        for i,j in dic.items():
            if j==1:
                l.append(i)
        if len(l)>=k:
            return l[k-1]
        return ""
    