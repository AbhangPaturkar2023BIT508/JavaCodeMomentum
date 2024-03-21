public class Main {
    static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 5, height = 8;
        System.out.println("Area of the triangle: " + areaOfTriangle(base, height));
    }
}
