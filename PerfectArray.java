class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        int perfectCount = 0;
        for(int i = 0, j = n-1; (i<n) && (j>=0); i++,j--){
            if(a[i] == a[j]){
                perfectCount = perfectCount + 1;
            }
        }
        
        if(perfectCount == n){
            return true;
        }else{
            return false;
        }
        
    }
    
}