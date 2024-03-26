public class Main {
    static String toRoman(int num) {
        return Integer.toRoman(num);
    }

    public static void main(String[] args) {
        int number = 123;
        System.out.println("Roman numeral representation of " + number + " is " + toRoman(number));
    }
}
