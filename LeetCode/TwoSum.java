class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] newArr = new int[2];
	    while(left < right){
	    	int sum = numbers[left] + numbers[right];
	        if(sum == target){
                newArr[0] = left + 1;
	            newArr[1] = right + 1;
	            break;
	        } else if(sum < target) {
	        	left++;
	        } else {
	        	right--;
	        }
	    }
	    return newArr;   
    }
}
