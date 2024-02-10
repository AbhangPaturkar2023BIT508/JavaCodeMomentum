class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int index[] = {-1,-1};
        for(int i = 0; i < N; i++){
            if(a[i] == key){
                index[0] = i;
                break;
            }
        }
        
        for(int i = N-1; i >= 0; i--){
            if(a[i] == key){
                index[1] = i;
                break;
            }
        }
        
        return index;
    }
}