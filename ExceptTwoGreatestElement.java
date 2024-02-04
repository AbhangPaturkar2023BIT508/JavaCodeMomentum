
class Solution {
    public long[] findElements( long a[], long n)
    {
         Arrays.sort(a);
         long []arr = new long[a.length-2];
         System.arraycopy(a,0,arr,0,arr.length);
         
            return arr;
        
    }
}