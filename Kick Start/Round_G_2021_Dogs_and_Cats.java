import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); //test cases
		
		for(int i = 1; i <= T; i++) {
			String answer = "YES";
			long n = input.nextInt(); // total animals
			long d = input.nextInt(); // total dog food portions
			long c = input.nextInt(); // total cat food portions
			long m = input.nextInt(); // extra cat food when dog eats
			String s = input.next(); // the line of animals
			boolean canFeedDogs = true;
			boolean mustPause = false;
			
			long dogs = 0;
			long dogsFed = 0;
			// find how many dogs we need to feed
			for(char curr: s.toCharArray()) {
				if(curr == 'D') {
					dogs++;
				}
			}
			// go thru the line
			for(char curr : s.toCharArray()) {
				if (curr == 'D'){
					d--;
					c+=m;
					if(d < 0) {
						canFeedDogs = false;
						answer = "NO";
						break;
					}
					dogsFed++;
				} else {
					c--;
					if(c < 0) {
						mustPause = false;
						break;
					}
				}
			}
			if(dogsFed != dogs) {
				answer = "NO";
			}
			if(mustPause && (dogsFed < dogs)) {
				answer = "NO";
			}
			
			System.out.println("Case #" + i + ": " + answer);			
		}
	}
	
}
