class Solution {
    public int[] replaceElements(int[] arr) {
        //go thru the array starting at the 2nd to last element
		//the greatest element starts as the last one
		//update the greatest element if needed
		int greatest = arr[(arr.length)-1];
		for(int i = arr.length-2; i >= 0; i--) {
			int current = arr[i];
			arr[i] = greatest;
			if(current>greatest) {
				greatest = current;
			}
		}
		//don't forget to change the last element to -1
		arr[arr.length-1] = -1;
        return arr;
    }
}
