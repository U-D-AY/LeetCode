from collections import Counter
class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        c = Counter(costs)
        c = sorted(c.items())
        cou = 0
        for i, j in c:
            if coins < i:
                break
            z = min(j, coins//i)
            cou += z
            coins -= z*i
            
        return cou
            

