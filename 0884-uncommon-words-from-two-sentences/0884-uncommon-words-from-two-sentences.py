class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> list[str]:
        count = Counter(s1.split()) + Counter(s2.split())

        return [word for word, cnt in count.items() if cnt == 1]