class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        if len(tokens) == 1:
            return int(tokens[-1])

        st = []
        op = {'*', '/', '+', '-'}

        for i in tokens:
            if i not in op:
                st.append(i)
            else:
                a = st.pop()
                b = st.pop()

                e = str(int(eval(b + i + a)))
 
                st.append(e)
        return int(st[-1])
            