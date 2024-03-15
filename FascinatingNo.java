import java.util.Arrays;

class Solution {
    boolean fascinating(long n) {
        // code here
        char[] a = {};
        char[] b = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        if (Long.toString(n).length() >= 3) {
            long m3 = n * 3;
            long m2 = n * 2;

            String s = n + "" + m2 + "" + m3;
            a = s.toCharArray();
            Arrays.sort(a);

        }

        if (Arrays.equals(a, b)) {
            return true;
        } else {
            return false;
        }
    }
}

public class FascinatingNo {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.fascinating(123456789));
        System.out.println(obj.fascinating(192));
        System.out.println(obj.fascinating(555));

    }
}
