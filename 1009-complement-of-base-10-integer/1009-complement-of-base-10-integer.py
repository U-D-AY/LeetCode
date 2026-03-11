class Solution:
    def bitwiseComplement(self, n: int) -> int:
        bits = n.bit_length() or 1
        m = (1<<bits)-1
        return ~n&m