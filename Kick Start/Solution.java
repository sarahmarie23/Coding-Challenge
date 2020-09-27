package kickStart;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); //test cases
		
		for(int testCase = 1; testCase <= T; testCase++) {
			int N = input.nextInt(); //number of people in line
			int X = input.nextInt(); //max withdraw amount at 1 time
			Integer arr[] = new Integer[N];
			int newArr[] = new int[N];
			int person = 0;
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = input.nextInt();
			}//now the array of amounts needed is built
			//find max
			int max = Collections.max(Arrays.asList(arr));
			int rounds = (max + X - 1) / X;
			
			for(int i = 1; i <= rounds; i++) {
				for(int j = 0; j < arr.length; j++) {
					if(arr[j] > 0) { //meaning they still need $
						arr[j] = (arr[j] - X);
						if(arr[j] <= 0) {
							newArr[person] = (j+1);
							person++;
						}
					}
				}
			}
			System.out.println("Case #" + testCase + ": " + Arrays.toString(newArr)
								.replaceAll("\\[|\\]|,|", ""));			
		}   
    }    
}
