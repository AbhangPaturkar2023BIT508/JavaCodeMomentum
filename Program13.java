public class Main {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber(10);
        p1.display();
    }
}

class PrintNumber {
    private int N;

    public PrintNumber(int n) {
        N = n;
    }

    public void display() {
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}
