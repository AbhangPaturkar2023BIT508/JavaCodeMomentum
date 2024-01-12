public class FobanacciSeries {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 0;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i < 6; i++) {
            num3 = num1 + num2;
            System.err.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
