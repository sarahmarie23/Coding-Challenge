import java.util.Arrays;
class Solution {
    public int maxProductDifference(int[] nums) {
      //Take the two smallest numbers and multiply, take the two largest numbers and multiply, subtract smallest from largest
        int productDifference = 0;
        Arrays.sort(nums);
        productDifference = ((nums[(nums.length)-1]*nums[(nums.length)-2])-(nums[0]*nums[1]));
        return productDifference;
    }
}
