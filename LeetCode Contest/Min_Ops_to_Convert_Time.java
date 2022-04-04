class Solution {
    public int convertTime(String current, String correct) {
        int changes = 0;
        
        String currH = current.substring(0, 2); 
        String currM = current.substring(3);
        String corrH = correct.substring(0, 2); 
        String corrM = correct.substring(3);
        
        int currentH = Integer.parseInt(currH);
        int currentM = Integer.parseInt(currM);
        int correctH = Integer.parseInt(corrH);
        int correctM = Integer.parseInt(corrM);
        
        int diffH = Math.abs(correctH - currentH);
        int diffM = correctM - currentM;
        
        int totalMin = diffH * 60 + diffM;
        
        
        while(totalMin > 0){
            if(totalMin >= 60){
                totalMin -= 60;
                changes++;
            } else if (totalMin >= 15) {
                totalMin -= 15;
                changes++;
            } else if (totalMin >= 5) {
                totalMin -= 5;
                changes++;
            } else {
                totalMin -= 1;
                changes++;
            }
        }
        return changes;
    }
}
