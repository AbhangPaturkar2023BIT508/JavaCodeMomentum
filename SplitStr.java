class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        List<String> s = new ArrayList<String>();
        String s1 = "", s2 = "", s3 = "";
        for(int i=0; i < S.length();i++){
            char ch = S.charAt(i);
            if(Character.isLetter(ch)){
                s1+=ch;
            }else if(Character.isDigit(ch)){
                s2+=ch;
            }else{
                s3+=ch;
            }
        }
        s.add(s1);
        s.add(s2);
        s.add(s3);
        
        return s;
    }
} 