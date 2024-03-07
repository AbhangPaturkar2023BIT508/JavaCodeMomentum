class Sol
{
    Boolean check (String s)
    {
        // your code here  
        char ch = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != ch){
                return false;
            }
        }
        return true;
    }
}