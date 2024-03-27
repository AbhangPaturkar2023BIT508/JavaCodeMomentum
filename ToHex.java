public class Main {
    static String toHex(int num) {
        return Integer.toHexString(num);
    }

    public static void main(String[] args) {
        int number = 255;
        System.out.println("Hexadecimal representation of " + number + " is " + toHex(number));
    }
}
