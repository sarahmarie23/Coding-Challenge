class Solution:
    def minMaxGame(self, nums: List[int]) -> int:
      
        if len(nums) == 1:
            return nums[0]
          
        else:
            newNums = []
            i = 0
            stop = int(len(nums)/2)
            
            for x in range(1, stop+1):
                if x % 2 == 1:
                    newNums.append(min(nums[2 * i], nums[2 * i + 1]))

                else:
                    newNums.append(max(nums[2 * i], nums[2 * i + 1])) 
                    
                i += 1
                
            nums = newNums
  
        return self.minMaxGame(nums)
        
