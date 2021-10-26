import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); //test cases
		
		for(int i = 1; i <= T; i++) {
			int N = input.nextInt(); // length of string
			String S = input.next(); // the given string
			int answer = 1;
			
			System.out.print("Case #" + i + ": " + answer);
			int current = 1;
			for(int j = 1; j < N; j++) {
				
				if(S.charAt(j) <= S.charAt(j-1)) {
					current = 1;
				} else {
					current++;
				}
				System.out.print(" " + current);
			}
			System.out.println();
		}
	}
	
}
