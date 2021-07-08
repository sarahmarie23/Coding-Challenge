import java.nio.charset.StandardCharsets;

class Solution {
    public char findTheDifference(String s, String t) {
    	//figure out which letter was added to string t
    	int sSum = 0;
    	int tSum = 0;
    	byte[] sArr = s.getBytes(StandardCharsets.US_ASCII);
    	byte[] tArr = t.getBytes(StandardCharsets.US_ASCII);
    	for(byte b : sArr) {
    		sSum = sSum + b;
    	}
    	for(byte b : tArr) {
    		tSum = tSum + b;
    	}
    	
    	int difference = tSum - sSum;
    	char letter = (char) difference;
    	
        return letter;
    }
}
