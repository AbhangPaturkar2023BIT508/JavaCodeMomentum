class Sol
{
    int countCamelCase (String s)
    {
        // your code here 
        int count = 0;
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        
        return count;
    }
}