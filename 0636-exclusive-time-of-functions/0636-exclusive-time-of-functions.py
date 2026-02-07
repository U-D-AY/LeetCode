class Solution:
    def exclusiveTime(self, n: int, logs: List[str]) -> List[int]:
        res = [0]*n
        st = []
        p = 0

        for i in logs:
            fun_id, state, t_s = i.split(":")
            fun_id, t_s = int(fun_id), int(t_s)

            if state == 'start':
                if st:
                    res[st[-1]] += t_s - p
                st.append(fun_id)
                p = t_s
            else:
                res[st.pop()] += t_s - p + 1
                p = t_s + 1
        return  res