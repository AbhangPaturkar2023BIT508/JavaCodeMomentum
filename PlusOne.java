class Solution {
    public static int[] plusOne(int[] digits) {
        if (digits.length > 0) {
            String num = "";
            for (int a : digits) {
                num += String.valueOf(a);
            }
            num = String.valueOf(1 + Long.parseLong(num));
            int arr[] = new int[num.length()];
            for (int i = 0; i < num.length(); i++) {
                arr[i] = Character.getNumericValue(num.charAt(i));
                // System.out.println(arr.getClass());
            }
            return arr;
        } else {
            return digits;
        }

    }

    public static void main(String[] args) {
        int digits[] = { 1, 2, 3 };
        int ar[] = plusOne(digits);
        for (int i : ar) {
            System.out.println(i);
        }
    }
}