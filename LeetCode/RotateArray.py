class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        s = len(nums)
        
        if k > len(nums):
            k %= len(nums)
        
        nums.extend(nums[0:len(nums)-k])
        del nums[:s-k]
        
