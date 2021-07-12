import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int newLength = nums.length * 2;
        int[] newArr =  new int[newLength];
        
        for(int i = 0; i < nums.length; i++){
         newArr[i] = nums[i];
        }
        
        int count = 0;
        for(int i = nums.length; i < newArr.length; i++){

          newArr[i] = nums[count];
          count++;
        }
        return newArr;
    }
}
