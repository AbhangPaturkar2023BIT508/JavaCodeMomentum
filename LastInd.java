class Solution {
    public int lastIndex( String s) {
        int ind = -1;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '1'){
                ind = i;
                break;
            }
        }
        return ind;
    }
}