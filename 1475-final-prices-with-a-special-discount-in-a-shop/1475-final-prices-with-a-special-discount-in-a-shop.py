class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        res = prices[:]
        st = []
        for i, p in enumerate(prices):
            while st and prices[st[-1]] >= p:
                x = st.pop()
                res[x] = prices[x] - p
            st.append(i) 

        return res        
