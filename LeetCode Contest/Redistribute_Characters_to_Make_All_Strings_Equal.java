class Solution {
    public boolean makeEqual(String[] words) {
        //go through each word in the array
        //for each letter, tally it up
        Map<Character, Integer> alphaMap = new HashMap<Character, Integer>();
      
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){

                char c = words[i].charAt(j);
      
                if (alphaMap.containsKey(c)){
                   alphaMap.put(c, alphaMap.get(c) + 1);
                }else{
                   alphaMap.put(c, 1);
                }
              }
          }
    
    //after that's done, take all the letters that have tallies
    //go through each letter
    //if letterTally % words.length != 0, you know it won't work

      for (Map.Entry<Character, Integer> entry : alphaMap.entrySet()){
        int letterTally = entry.getValue();
        if (letterTally % words.length != 0){
          return false;
        }
      }
    return true;
    }
}
