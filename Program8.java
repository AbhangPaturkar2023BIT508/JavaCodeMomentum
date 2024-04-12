import java.util.Scanner;

class Triangle {
    private double base, height;

    // Default Constructor
    public Triangle() {
        base = 5;
        height = 10;
    }

    // Parameterized Constructor
    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    // Copy Constructor
    public Triangle(Triangle t) {
        base = t.base;
        height = t.height;
    }

    public void calculateArea() {
        double area = (base * height) / 2;
        System.out.println("Area of triangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, height;

        System.out.print("Enter the base of triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of triangle: ");
        height = scanner.nextDouble();

        Triangle t1 = new Triangle(); // Default Constructor
        System.out.println("Area using default constructor:");
        t1.calculateArea();

        Triangle t2 = new Triangle(base, height); // Parameterized Constructor
        System.out.println("\nArea using parameterized constructor:");
        t2.calculateArea();

        Triangle t3 = new Triangle(t2); // Copy Constructor
        System.out.println("\nArea using copy constructor:");
        t3.calculateArea();
    }
}
