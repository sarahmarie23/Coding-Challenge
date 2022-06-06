class Solution:
    def arrayChange(self, nums: List[int], operations: List[List[int]]) -> List[int]:
        d = {k: v for v, k in enumerate(nums)}
        for i in range(0, len(operations)):
            key = operations[i][0]
            change = operations[i][1]
            d.update({change:d[key]})
            del d[key]
            
        d = dict(sorted(d.items(), key=lambda item: item[1]))    
        
        nums = list(d.keys())
        
        return nums
