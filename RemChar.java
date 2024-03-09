class Solution {
    String removeCharacters(String S) {
        // code here
        String digit = "";
        
        for(char ch : S.toCharArray()){
            if(Character.isDigit(ch)){
                digit += ch;
            }
        }
        return digit;
    }
}