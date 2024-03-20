public class Main {
    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2, exponent = 5;
        System.out.println(base + " raised to the power " + exponent + " is: " + power(base, exponent));
    }
}
