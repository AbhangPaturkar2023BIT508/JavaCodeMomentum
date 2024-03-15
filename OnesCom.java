class Solution{
    static String onesComplement(String S,int N){
        //code here
        S = S.replace('0', '2');
        S = S.replace('1', '3');
        S = S.replace('2', '1');
        S = S.replace('3', '0');
        return S;
    }
}