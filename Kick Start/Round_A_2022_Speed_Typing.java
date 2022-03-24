import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); //test cases
		
		for(int i = 1; i <= T; i++) {
			String I = input.next(); // string to be typed
			String P = input.next(); // the resulting string
			String answer = "IMPOSSIBLE";
			
			if(I.equals(P)) {
				answer = "0";
			} else if(I.length() > P.length()) {
				break; //answer = impossible
			} else {
				answer = popThat(I, P);
			}
			
			System.out.print("Case #" + i + ": " + answer); 
			
		}
	}
	public static String popThat(String I, String P) {
		String answer = "IMPOSSIBLE";
		int removed = 0;
		
		Stack<Character> Istack = new Stack<Character>();
		Stack<Character> Pstack = new Stack<Character>();
		
		for(Character c : I.toCharArray()) {
			Istack.push(c);
		}
		
		for(Character c : P.toCharArray()) {
			Pstack.push(c);
		}
		
		while (Pstack.size() >= Istack.size()) {
			
			if(Istack.isEmpty() ) { 
				answer = Integer.toString(removed + Pstack.size());
				return answer;
			} else {
				while(Istack.peek() != Pstack.peek()) {
					if(Pstack.size() == 1) {
					    return answer;
				    } 
					Pstack.pop();
					removed++;
				}
				Istack.pop();
				Pstack.pop();
			}
		}
		return answer;
	}
}
