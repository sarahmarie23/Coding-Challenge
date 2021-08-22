import java.util.Random;
import java.util.Scanner;

public class Solution {
	private final static Random rand = new Random();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); 
		String answer;
		for(int i = 1; i <= T; i++) {
			String word = input.next();
			char[] charArr = word.toCharArray();
			shuffle(charArr);
			for(int j = 0; j < word.length(); j++) {
				if(charArr[j] != word.charAt(j)) {
					continue;
				}
				for(int k = 0; k < word.length(); k++) {
					if(charArr[j] != charArr[k] && charArr[j] != word.charAt(k) && charArr[k] != word.charAt(j)) {
						char temp = charArr[j];
	                    charArr[j] = charArr[k];
	                    charArr[k] = temp;
	                    break;
					}
				}
			}
			boolean isImpossible = (checkImpossible(word, charArr));
			
			if (isImpossible == true){
				answer = "IMPOSSIBLE";
			} else {
				answer = new String(charArr);
			}
			System.out.println("Case #" + i + ": " + answer);			
		}   
	}
	
	public static void shuffle(char[] arr) {
		for(int i = arr.length - 1; i > 0; i--) {
			int random = rand.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
		}
	}
	
	public static boolean checkImpossible(final String s1, final char[] s2) {
        for (int i = 0; i < s2.length; i++)
            if (s1.charAt(i) == s2[i]) {
                return true;
            }
        return false;
    }
}
