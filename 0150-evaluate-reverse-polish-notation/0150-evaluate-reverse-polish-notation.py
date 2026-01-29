from operator import add, sub, mul

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        op = {
            '+' : add,
            '-' : sub,
            '*' : mul,
            '/' : lambda a, b : int(a / b)
        }
        st = []

        for i in tokens:
            if i in op:
                a = st.pop()
                b = st.pop()
                st.append(op[i](b, a))
            else:
                st.append(int(i))
        
        return st.pop()
            