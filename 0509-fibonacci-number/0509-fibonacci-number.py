class Solution(object):
    def fib(self, n):
        ans = [-1]*(n+1)
        def dpfib(n):
            if n<=1:
                return n
            if ans[n]!=-1:
                return ans[n]
            n1=dpfib(n-1)
            n2=dpfib(n-2)
            ans[n]=n1+n2
            return n1+n2
        return dpfib(n)
        