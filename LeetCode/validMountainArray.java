class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean solution = true;
        int peak = 0;
        //easy eliminate too short array
        if(arr.length < 3) {
        	return !solution;
        }
        //easy eliminate peak at first index
        if(!(arr[1]>arr[0])) {
        	return !solution;
        }
        //find the peak
        for(int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]) {
        		return !solution;
        	}
        	if((arr[i]<arr[i-1])) {
        		peak = i;
                break;
        	}
        }
        //if there is only uphill, return false
        if(peak == 0) {
        	return !solution;
        }
  
        //make sure the descent is strictly descending
        for(int i = peak; i < arr.length-1; i++) {
        	if(!(arr[i+1]<arr[i])) {
        		return !solution;
        	}
        }
        return solution;
    }
}
