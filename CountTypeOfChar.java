class Sol
{
    int[] count (String s)
    {
        // your code here  
        int count[] = {0, 0, 0, 0};
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                count[1]++;
            }else if(Character.isUpperCase(s.charAt(i))){
                count[0]++;
            }else if(Character.isDigit(s.charAt(i))){
                count[2]++;
            }else{
                count[3]++;
            }
        }
        return count;
    }
}