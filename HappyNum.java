public class Main {
    static boolean isHappyNumber(int num) {
        int slow = num, fast = num;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    static int digitSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 19;
        System.out.println(number + " is happy number: " + isHappyNumber(number));
    }
}
