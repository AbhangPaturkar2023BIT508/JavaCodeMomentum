class Solution{
    String isVowel(char c){
        // code here
        c = Character.toLowerCase(c);
        if(c =='a' || c =='e' || c =='o' || c =='i' || c =='u'){
            return "YES";
        }else{
            return "NO";
        }
    }
}