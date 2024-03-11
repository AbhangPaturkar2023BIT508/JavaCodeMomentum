class Solution {
    public long sum_of_ap(long n, long a, long d) {
        long sum = 0l;
        for (long i = 0l; (i < n);i++) {
            sum += a + (i * d);
        }
        return sum;
    }
}