public class Main {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static int nthPrime(int n) {
        int count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num))
                count++;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The " + n + "th prime number is: " + nthPrime(n));
    }
}
