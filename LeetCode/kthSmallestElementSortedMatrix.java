import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    //put each int into an array list
	//sort the array list
	//find and return the kth element
		
		List<Integer> newList = new ArrayList<>();
        for(int[] i: matrix) {
        	for(int j: i) {
        		newList.add(j);
        	}
        }
        Collections.sort(newList);
        return newList.get(k-1);
        
    }
}
