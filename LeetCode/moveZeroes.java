class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZero = 0;
        int zero = 0;
        //get all the nonzeroes to the front
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            } else {
               nums[nonZero] = nums[i];
               nonZero++;
            }
        }
        //replace the latter part of the array with the correct amount of zeroes
        for(int i = nonZero; i < nums.length; i++){
          nums[i] = 0;
        }
        
    }
}
