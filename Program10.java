class Base1 {
    private int a = 1010;

    public void show_a() {
        System.out.println("a = " + a);
    }
}

class Derived1 extends Base1 {
    private int b = 2020;

    public void show_b() {
        System.out.println("b = " + b);
    }
}

class Base2 {
    private int c = 1111;

    public void show_c() {
        System.out.println("c = " + c);
    }
}

class NewDerived extends Base1 {
    private int d = 2222;

    public void show_d() {
        System.out.println("d = " + d);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Single Level Inheritance");
        Derived1 d1 = new Derived1();
        d1.show_a();
        d1.show_b();

        System.out.println("\nMultiple Inheritance");
        NewDerived nd = new NewDerived();
        nd.show_a();
        Base2 b2 = new Base2();from Base2
        b2.show_c();
        nd.show_d(); 
}
