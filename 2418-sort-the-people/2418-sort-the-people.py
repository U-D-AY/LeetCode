class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        d = list(zip(heights,names))
        a=dict(sorted(d,reverse=True))
        return a.values()