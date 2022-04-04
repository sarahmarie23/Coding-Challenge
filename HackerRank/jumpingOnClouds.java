class Result {
    public static int jumpingOnClouds(List<Integer> c) {
    
        int index = 0;
        int jumps = 0;
        
        while(index < c.size()){
            if(c.size() - index <= 3){
                jumps++;
                break;
            }
            if(c.get(index+2) == 1){
                index++;
            } else {
                index += 2;
            }
            jumps++;
        }   
        return jumps;
    }    
}
