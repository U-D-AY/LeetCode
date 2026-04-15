class Solution:
    def closestTarget(self, words: List[str], target: str, startIndex: int) -> int:
        n = len(words)
        
        if target not in words:
            return -1
        
        if words[startIndex] == target:
            return 0
        
        left = (startIndex - 1) % n
        right = (startIndex + 1) % n
        dist = 1
        
        while left != startIndex:  
            if words[left] == target:
                return dist
            if words[right] == target:
                return dist
            
            left = (left - 1) % n
            right = (right + 1) % n
            dist += 1
            
        return -1
