import java.util.Arrays;

public static int heightChecker(int[] heights) {
        int answer = 0;
        
		// make a copy of the array and sort it
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copy);
        
        // then go thru each index and compare
        for(int i = 0; i < heights.length; i++) {
        	if(heights[i] != copy[i]) {
        		answer++;
        	}
        }
        
		return answer;
    }
