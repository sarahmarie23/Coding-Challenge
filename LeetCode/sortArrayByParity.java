class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        
        while(leftIndex < rightIndex) {
        	while(nums[leftIndex] % 2 == 0 && leftIndex < nums.length-1) { // left is looking for odd
        		leftIndex++;
        	}
        	while(nums[rightIndex] % 2 == 1 && rightIndex > 0) { // right is looking for even
        		rightIndex--;
        	}
        	
            if(leftIndex > rightIndex) {
        		break;
        	}
            
        	int currLeft = nums[leftIndex];
        	int currRight = nums[rightIndex];
        	
        	nums[leftIndex] = currRight;
        	nums[rightIndex] = currLeft;
        	leftIndex++;
        	rightIndex--;
        }
		
		return nums;
    }
}
