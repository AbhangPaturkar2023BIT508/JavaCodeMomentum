public class Pattern3 {

    // _____*
    // ____* *
    // ___* * *
    // __* * * *
    // _* * * * *
    // * * * * * *
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("_");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
