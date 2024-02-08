class Solution{
    public int countOfElements(int []arr,int n,int x)
    {
        // code here
        int lessCount = 0;
        for(int i = 0;i < n; i++){
            if(arr[i] <= x){
                lessCount++;
            }
        }
        
        return lessCount;
    }
}