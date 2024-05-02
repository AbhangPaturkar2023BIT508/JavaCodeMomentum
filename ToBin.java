public class Main {
    static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int number = 25;
        System.out.println("Binary representation of " + number + " is " + decimalToBinary(number));
    }
}
