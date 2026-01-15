class Solution:
    def romanToInt(self, s: str) -> int:
        hash={"M":1000,"D":500,"C":100,"L":50,"X":10,"V":5,"I":1}
        sum=i=0
        while(i<=len(s)-2):
            if hash[s[i]]>=hash[s[i+1]]:
                sum+=hash[s[i]]
            else:
                sum+=hash[s[i+1]]-hash[s[i]]
                i+=1
            i+=1
        if i<=len(s)-1:
            sum+=hash[s[i]]
            return sum
        return sum
