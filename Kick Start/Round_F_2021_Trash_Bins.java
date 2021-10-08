import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); //test cases
		
		for(int i = 1; i <= T; i++) {
			long answer = 0;
			int n = input.nextInt();
			String s = input.next();
			
			int first = s.indexOf("1");
			int last = s.lastIndexOf("1");
			int left, right;
			
			//figure out if the first bin is to the left or right
			if(first == 0) {
				left = 0;
				right = s.indexOf("1", 1);
			} else {
				right = first;
				left = -1;
			}
			
			int leftCheck, rightCheck = 0;
			boolean lastBin = false;
	
			if(first == last) {
				//only 1 trash bin
				answer = oneTrashBin(s, first);
			} else {
				for(int j = 0; j < n; j++) {
					if(s.charAt(j) == '0') {
						if(right == first) { //starting off with only option is to go right
							answer += Math.abs(right - j);
						} else if (lastBin) { //ending with only option is to go left
							answer += Math.abs(j - left);
						} else { //need to check both directions
							leftCheck = (j - left);
							rightCheck = (right - j);
							answer += Math.min(leftCheck, rightCheck);
						}
					} else { //update new position of bins
						left = j;
						right = s.indexOf("1", j+1);
						if(right == -1 ) { //if end of the street, go to last bin condition
							left = last;
							lastBin = true;
						}
					}
				}
			}
			System.out.println("Case #" + i + ": " + answer);			
		}
	}
	public static long oneTrashBin(String s, int first) {
		long answer = 0;
		for(int i = 0; i < s.length(); i++) {
			answer += Math.abs(i-first);
		}	
		return answer;
	}
}
