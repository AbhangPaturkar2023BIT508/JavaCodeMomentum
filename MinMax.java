class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        long b=a[0];
        long c = a[(int)(n-1)];
        
        Pair p = new Pair(b,c);
        return p;
    }
}