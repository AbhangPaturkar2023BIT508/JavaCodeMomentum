class Solution {
    static String delAlternate(String S) {
        // code here
        String s = "";
        for(int i = 0; i < S.length(); i++){
            if(i % 2 == 0){
                char ch = S.charAt(i);
                s = s + ch;
            }
        }
        
        return s;
    }
}