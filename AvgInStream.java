class Solution {
    float[] streamAvg(int[] arr, int n) {
        // code here
        float a[]= new float[n];
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum = sum + arr[j];
            }
            float mean = ((float)sum / (i+1));
            a[i] = mean;
        }
        return a;
    }
}