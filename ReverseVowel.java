class Solution
{
    String modify (String s)
    {
        // your code here
        char arr[] = s.toLowerCase().toCharArray();
        String vs = "";
        for(int i = (arr.length-1); i >= 0; i--){
            char ch = arr[i];
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                vs += ch;
            }
        }
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                arr[i] = vs.charAt(j);
                j++;
            }
        }
        return String.valueOf(arr);
    }
}