import itertools

class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        l=itertools.combinations(words,2)
        cont=0
        for i in l:
            fir=len(i[0])
            if fir==2*len(i[1]):
                continue
            else:
                if i[1][:fir]==i[0] and i[1][-fir:]==i[0]:
                    cont+=1
        return cont