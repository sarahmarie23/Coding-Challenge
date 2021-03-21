import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); //test cases
		
		for(int testCase = 1; testCase <= T; testCase++) {
			int N = input.nextInt(); //number of letters in the word
			int K = input.nextInt(); //target score
			String S = input.next(); //given string
			
			//see what score the string already is
			int score = 0;
			int finalAnswer = 0;
			for(int i = 1; i <= N/2; i++) {
				//if first and last char are different, add a point
				char left = S.charAt(i-1);
				char right = S.charAt(N-i);
				if (left != right){
					score++;
				}
			}
			//see if you need to change letters
			if (score == K) {
				finalAnswer = 0;
			} else {
				finalAnswer = Math.abs(K-score);
			}
			System.out.println("Case #" + testCase + ": " + finalAnswer);			
		}   
    }    
}
