class Solution {
    static int logicalOperation(int A,int B,int C,int D,int E,int F){
        // code here
        boolean notA = A == 0;
        boolean notF = F == 0;
        
        boolean term1 = notA && (B != 0);
        boolean term2 = C != 0 && D != 0;
        boolean term3 = E != 0 && notF;

        boolean result = term1 || term2 || term3;

        return result ? 1 : 0;
    }
}