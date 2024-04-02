class Solution {
    int isPerfect(int N) {
        // code here
        int temp = N, sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            int fact =1; 
            for(int i = 1; i <= digit; i++){
                fact*=i;
            }
            sum+= fact;
            temp /= 10;
        }
        if(sum == N){
            return 1;
        }else{
            return 0;
        }
    }
}