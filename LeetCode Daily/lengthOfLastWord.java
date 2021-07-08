class Solution {
    public int lengthOfLastWord(String s) {
        String oneWord = removeEndSpace(s);
        oneWord = removeWords(oneWord);
        return (oneWord.length());
    }
    
    public static String removeEndSpace(String s) {
		return s.trim();
	}
    
    public static String removeWords(String s) {
		if(!s.contains(" ")) {
			return s;
		} else {
			String s1 = s.substring(s.indexOf(" ")+1);
			return(removeWords(s1));
		}
	}
}
