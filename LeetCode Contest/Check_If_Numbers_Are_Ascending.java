class Solution {
    public boolean areNumbersAscending(String s) {
    // replace all non-numbers with a ,
		// break string into array at each ,
		// make sure numbers are strictly increasing
		boolean answer = true;
		
		s = s.replaceAll("[^0-9]", " ");
		s = s.trim();
		s = s.replaceAll("\\s+",",");
		
		String[] strArray = s.split(",");
		int[] intArray = new int[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
		    intArray[i] = Integer.parseInt(strArray[i]);
		}
		
		for(int i = 1; i < intArray.length; i++) {
			if (intArray[i] <= intArray[i-1]){
				answer = false;
			}
		}
		return answer;	
    }
}
