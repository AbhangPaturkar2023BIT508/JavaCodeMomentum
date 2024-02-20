class Solution {
    String removeVowels(String S) {
        // code here
        // String str = "";
        // S = S.toUpperCase();
        S = S.replaceAll("[aeiouAEIOU]","");
        // for(int i = 0; i<S.length(); i++){
        //     char ch = S.charAt(i);
        //     if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
        //         str += ch;
        //     }
        // }
        // return str.toLowerCase();
        return S;
    }
}