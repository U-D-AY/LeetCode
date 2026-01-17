class Solution:
    def isValid(self, s: str) -> bool:
        d = {
            ")":"(",
            "]":"[",
            "}":"{"
        }
        st=[]
        for i in s:
            if i not in d:
                st.append(i)
            else:  
                if not st or d[i] != st.pop():
                    return False

        return not st