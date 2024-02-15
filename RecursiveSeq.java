class Solution{
    static long sequence(int n){
        // code here
        long sum = 0l;
        int a = 1;
        for(int i = 1; i <= n; i++){
	    long mul = 1l;
            int t = 1;
            System.out.println(a);
            //System.out.println(sum);
            for(int j = a; t<=i; j++){
                mul = mul * j;
                t++;
            }
            // System.out.println("mul : "+mul);
            sum = sum + mul;
            System.out.println("sum : "+sum);
            a+=i;
        }
        if(sum <= Integer.MAX_VALUE){
            return sum;
        }else{
            return sum % 1000000007;
        }
        
    }

    public static void main(String args[]){
    	System.out.println(Solution.sequence(11));
    }
}

