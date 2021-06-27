class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        
        if(!text.contains(" ")) {
    		return text;
    	}
    	
    	for(int i = 0; i < text.length(); i++){
    	    if(text.charAt(i) == ' '){
    	        spaces++;
    	    }
    	}
    	String sentenceArr[] = text.trim().split("\\s+");
    	int words = sentenceArr.length;
        
        if(words == 1) {
    		StringBuilder oneWord = new StringBuilder();
    		String oneSpaces = new String(new char[spaces]);
    		oneSpaces = oneSpaces.replace('\0', ' ');
    		oneWord.append(sentenceArr[0]);
    		oneWord.append(oneSpaces);
    		String newShort = oneWord.toString();
    		return newShort;
    	}
        
    	int spacesBetweenWords = spaces/(words-1);
    	int remainder = spaces % (words-1);
    	
    	StringBuilder build = new StringBuilder();
    	
    	String space = new String(new char[spacesBetweenWords]);
    	space = space.replace('\0', ' ');
    	
    	String remainderString = new String(new char[remainder]);
    	remainderString = remainderString.replace('\0', ' ');
    	
    	for(int i = 0; i < sentenceArr.length-1; i++) {
    		build.append(sentenceArr[i]);
    		build.append(space);
    	}
    	build.append(sentenceArr[sentenceArr.length-1]);
    	build.append(remainderString);
    	String newString = build.toString();
        return newString;
    }
}
