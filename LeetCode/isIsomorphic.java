import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //for each letter in s
        //if its not in the hashmap
            //if the t char is already a value that exists, return false
            //put it in, with the equivalent letter in t being the value
        //if it is in the hashmap
            //check that the key/value matches
            //if not, return false
        HashMap<Character, Character> letterMap = new HashMap<Character, Character>();
        char currentS, currentT;
        for(int i = 0; i < s.length(); i++){
            currentS = s.charAt(i);
            currentT = t.charAt(i);
            if (!letterMap.containsKey(currentS)){
              if(letterMap.containsValue(currentT)){
                return false;
              }
                letterMap.put(currentS, (t.charAt(i)));
            } else {
                if (currentT != letterMap.get(currentS)){
                    return false;
                }
            }
        }
        return true;       
    }
}
