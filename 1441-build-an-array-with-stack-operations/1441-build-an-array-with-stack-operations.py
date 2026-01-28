class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        sol = []
        st = []
        t = 0

        for i in range(1, n+1):
            st.append(i)
            sol.append('Push')
            t += 1
            if target[t - 1] != i:
                st.pop()
                sol.append('Pop')
                t -= 1
            if target == st:
                return sol
