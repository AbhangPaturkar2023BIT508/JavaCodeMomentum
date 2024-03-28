public class Main {
    static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        double radius = 5;
        System.out.println("Area of the circle: " + areaOfCircle(radius));
    }
}
