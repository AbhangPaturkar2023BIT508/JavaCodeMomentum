class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int sum1 = 0, sum2 = 0, sum = 0;
        for(int i = 0; i < N; i++){
            sum1 = sum1 + Grid[i][i];
        }
        
        for(int i = 0, j = (N-1); i < N && j>=0; i++, j--){
            sum2 = sum2 + Grid[i][j];
        }
        
        sum = Math.abs(sum1 - sum2);
        return sum;
        
    }
}