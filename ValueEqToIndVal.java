class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < n;  i++){
            if(arr[i] == i+1){
                result.add(arr[i]);
            }
        }
        return result;
    }
}