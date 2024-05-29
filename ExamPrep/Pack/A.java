package Abhang;

public class A {
    public void show(){
        System.out.println("Show method calld");
    }
}

class B{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}