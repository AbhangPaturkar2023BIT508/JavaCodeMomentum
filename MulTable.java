class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> res = new ArrayList();
        for(int i = 1; i <= 10; i++){
            res.add(i*N);
        }
        return res;
    }
}