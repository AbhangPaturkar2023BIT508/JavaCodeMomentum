public class Moverload {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(int a, int b) {
        return (double) (a + b);
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 2));
    }
}
