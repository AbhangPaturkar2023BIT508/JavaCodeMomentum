class Exam{
    Exam(){
        System.err.println("Constructor");
    
    }
    static{
        System.out.println("Static");
    }
}

public class Midterm {
    static void a(long c, int b) {
        System.out.println(b + c);
    }

    static void a(int c, long b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        Integer a = 1000;
        System.out.println(a +(a=15));
        System.out.println(a = 500000);
        Exam e = new Exam();
        System.out.println(a);
    }
}
