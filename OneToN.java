class Solution{
    static void printTillN(int N){
        // code here
        if(N > 0){
            printTillN(N - 1);
            System.out.print(N + " ");
        }
    }
}