public class Main {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 30;
        System.out.println("GCD: " + gcd(num1, num2));
        System.out.println("LCM: " + lcm(num1, num2));
    }
}
