class Solution {
    public String reverseWords(String s) {
        String[] splitString = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for(int i = 0; i < splitString.length; i++){
            String process = reverseString(splitString[i]);
            splitString[i] = process;
        }
    
        for(int j = 0; j < splitString.length; j++ ){
            reversed.append(splitString[j]);
            if(j != splitString.length-1){
                reversed.append(" ");
            }
        }
    return reversed.toString(); 
    }
    public static String reverseString(String s) {
        StringBuilder newString = new StringBuilder(s);
    
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            char temp = s.charAt(right);
            char l = s.charAt(left);
            newString.setCharAt(right, l);
            newString.setCharAt(left, temp);
            left++;
            right--;
        }
        return newString.toString();
    }
}
