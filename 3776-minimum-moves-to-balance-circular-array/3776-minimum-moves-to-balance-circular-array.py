class Solution:
    def minMoves(self, balance: List[int]) -> int:
        x, idx = 0, 0
        for j, i in enumerate(balance):
            if i<0:
                x = i
                idx = j
                break
        if x == 0: return x

        n = len(balance)

        if n < 3:
            return sum(abs(i) for i in balance if i<0) if sum(balance) >= 0 else -1

        x = 0
        level = 1
        i, j = (idx-1)%n, (idx+1)%n
        for _ in range(n//2):

            if i == j:
                take = min(balance[i], abs(balance[idx]))
                x += take * level
                balance[idx] += take
                break

            if balance[i]>abs(balance[idx]):
                need = abs(balance[idx])
                x += need*level
                balance[idx] += need
                break
            else:
                x += balance[i]*level
                balance[idx] += balance[i]

            if balance[j]>abs(balance[idx]):
                need = abs(balance[idx])
                x += need*level
                balance[idx] += need
                break
            else:
                x += balance[j]*level
                balance[idx] += balance[j]

            i = (i-1)%n
            j = (j+1)%n
            level += 1

        return x if balance[idx] >= 0 else -1         

