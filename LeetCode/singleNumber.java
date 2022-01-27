import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        // sorting the array to make it easier to spot the single number
        Arrays.sort(nums);
        //setting the answer to the last number to avoid overflowing
        int answer = nums[nums.length-1];
        // if there's only one element, we just return it
        if(nums.length == 1) {
        	return nums[0];
        }
        // check the current number with the previous number and return if they are different
        for(int i = 1; i < nums.length; i+=2) {
        	if(nums[i] != nums[i-1]) {
        		return (answer = nums[i-1]);
        	}
        }
        
        return answer;
    }
}
