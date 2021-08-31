class Solution {
    public void rotate(int[] nums, int k) {
    //first check if there is an excessive amount of rotating
		int length = nums.length;
		if(k > length) {
			k %= length;
		}
		reverse(nums, 0, length-k-1); 
		reverse(nums, length-k, length-1);
		reverse(nums, 0, length-1);
    }
    public static void reverse(int[] nums, int left, int right) {
		while(left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}
}
