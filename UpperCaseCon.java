class Solution
{
    public String transform(String s)
    {
        // code here
        char arr[] = s.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        for(int i = 1; i < arr.length-1; i++){
            if(Character.isWhitespace(arr[i]) && Character.isLetter(arr[i+1])){
                arr[i+1] = Character.toUpperCase(arr[i+1]);
            }
        }
        return String.valueOf(arr);
        // for()
    }
}