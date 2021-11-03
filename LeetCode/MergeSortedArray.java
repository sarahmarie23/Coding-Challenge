class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // There are 3 situations: right array is blank -> don't need to do anything! 
		//                         left array is blank/filled with 0s -> dump right into left
		//                         they both have values -> need to merge
		int situation;
		
		if(n == 0) {
			situation = 1;
		} else if(m == 0) {
			situation = 2;
		} else {
			situation = 3;
		}
		
		switch(situation) {
		case 1:
			break;
		case 2:
			for(int i = 0; i < nums2.length; i++) {
				nums1[i] = nums2[i];
			}
			break;
		case 3:

			int left_ptr = m-1;
			int right_ptr = n-1;
			boolean leftDone = false; // turns true when all the left array values have been used
			boolean rightDone = false; // turns true when all the right array values have been used
			
			for(int i = nums1.length-1; i >= 0; i--) {
				if(!leftDone && !rightDone) {
					if(nums1[left_ptr] >= nums2[right_ptr]) {
						nums1[i] = nums1[left_ptr];
						left_ptr--;
						if(left_ptr < 0) {
							leftDone = true;
						}
					} else {
						nums1[i] = nums2[right_ptr];
						right_ptr--;
						if(right_ptr < 0) {
							rightDone = true;
						}
					}
				} else if(leftDone && !rightDone) {
					nums1[i] = nums2[right_ptr];
					right_ptr--;
					if(right_ptr < 0) {
						rightDone = true;
					}
				} else {
					nums1[i] = nums1[left_ptr];
					left_ptr--;
					if(left_ptr < 0) {
						leftDone = true;
					}
				}
				
			}
			
		}
		
    }
}
