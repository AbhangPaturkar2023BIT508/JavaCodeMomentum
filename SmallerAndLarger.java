class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int a[] = new int[2];
        int lessCount = 0, moreCount = 0;
        
        for(int i = 0; i < n; i ++){
            if(arr[i] <= x){
                lessCount++;
            }
            if(arr[i] >= x){
                moreCount++;
            }
        }
        
        a[0] = lessCount;
        a[1] = moreCount;
        
        return a;
    }
}