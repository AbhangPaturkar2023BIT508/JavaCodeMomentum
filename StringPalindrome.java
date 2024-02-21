class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuffer str = new StringBuffer(S);
        str.reverse();
        String t = str.toString();
        if(!t.equals(S)){
            return 0;
        }else{
            return 1;
        }
    }
};