import java.util.Collections;

class Solution {
    public String intToRoman(int num) {
        // use a StringBuilder to keep track of the Roman numeral as we build it up
		StringBuilder answer = new StringBuilder("");
		
		// go through and build it up, left to right
		while(num > 0) {
			if(num < 4000 && num >= 1000) {
				answer.append("M");
				num -= 1000;
			}
			if(num < 1000 && num >= 500) {
				if(num >= 900) {
					answer.append("CM");
					num -= 900;
				} else {
					answer.append("D");
					num -= 500;
				}
			}
			if(num < 500 && num >= 100) {
				if(num >= 400) {
					answer.append("CD");
					num -= 400;
				} else {
					answer.append("C");
					num -= 100;
				}
			}
			if(num < 100 && num >= 50) {
				if(num >= 90) {
					answer.append("XC");
					num -= 90;
				} else {
					answer.append("L");
					num -= 50;
				}
			}
			if(num < 50 && num >= 10) {
				if(num >= 40) {
					answer.append("XL");
					num -= 40;
				} else {
					answer.append("X");
					num -= 10;
				}
			}
			if(num < 10 && num >= 5) {
				if(num == 9) {
					answer.append("IX");
					num -= 9;
				} else {
					answer.append("V");
					num -= 5;
				}
			}
			if(num < 5 && num >= 1) {
				if(num == 4) {
					answer.append("IV");
					num -= 4;
				} else {
					answer.append("I");
					num -= 1;
				}
			}
		}
		
		return answer.toString();
    }
}
