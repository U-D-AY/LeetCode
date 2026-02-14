class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        result = [0]*len(temperatures)
        st = []

        for i, ct in enumerate(temperatures):

            while st and temperatures[st[-1]] < ct:
                x = st.pop()
                result[x] = i - x
            st.append(i)
        
        return result
                