import java.util.Hashtable;

class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        
        // build a small hashtable to keep track of the 7 different symbols 
        Hashtable<Character, Integer> romanNum = new Hashtable<Character, Integer>();
        
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        // the 6 special cases. We'll have to check for these and subtract as needed
        String IV = "IV"; // 4
        String IX = "IX"; // 9
        String XL = "XL"; // 40
        String XC = "XC"; // 90
        String CD = "CD"; // 400
        String CM = "CM"; // 900
       
        // first, loop over and add the corresponding values
        for(int i = 0; i < s.length(); i++) {
        	Character curr = s.charAt(i);
        	answer += romanNum.get(curr);
        }
        
        // then, check for special cases and subtract them out
        if(s.contains(IV)) {
        	answer += -2;
        }
        if(s.contains(IX)) {
        	answer -= 2;
        }
        if(s.contains(XL)) {
        	answer -= 20;
        }
        if(s.contains(XC)) {
        	answer -= 20;
        }
        if(s.contains(CD)) {
        	answer -= 200;
        }
        if(s.contains(CM)) {
        	answer -= 200;
        }
     
        return answer;
    }
}
