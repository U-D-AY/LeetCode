class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        cost.sort(reverse=True)
        x = len(cost)
        return sum([cost[i] for i in range(x) if (i+1)%3 != 0])