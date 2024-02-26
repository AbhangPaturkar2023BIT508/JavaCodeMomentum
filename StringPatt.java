class Solution {
    ArrayList<String> pattern(String S) {
        // code here
         ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < S.length(); i++) {
            result.add(S.substring(0, S.length() - i));
        }
        
        return result;
    }
};