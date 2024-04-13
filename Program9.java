import java.util.Scanner;

class Sample {
    private int x;
    private int y;

    public Sample(int a, int b) {
        x = a;
        y = b;
    }

    public void findMean() {
        double mean = (x + y) / 2.0;
        System.out.println("Mean of x and y: " + mean);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        Sample obj = new Sample(x, y);
        obj.findMean();
    }
}
