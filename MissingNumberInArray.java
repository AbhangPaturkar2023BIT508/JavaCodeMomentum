class Solution {
    int add(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = add(n);
        int mySum = 0;
        for(int i = 0; i<n-1; i++){
            mySum+=array[i];
        }
        
        return sum-mySum;
    }
}