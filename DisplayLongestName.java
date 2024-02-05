class GFG {
    String longest(String names[], int n) {
        int len = 0;
        String longest = null;
        ;
        
        for(int i = 0; i < n; i++){
            if(names[i].length() > len){
                len = names[i].length();
                longest = names[i];
            }
        }
        
        return longest;
    }
}