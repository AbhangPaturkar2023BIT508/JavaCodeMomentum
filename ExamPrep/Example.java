

class Outer1{
    static{
        System.out.println("Outere");
    }

    {
        System.out.println("out init");
    }

    Outer1(){
        System.out.println(" ooou constructor");
    }

    class Inner1{
        static{
            System.out.println("Inner Static");
        }

        {
            System.out.println("in init");
        }
    
        Inner1(){
            System.out.println(" iiin constructor");
        }
    }
}


class Main{
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
         Main ob = new Main();
         System.out.println(ob.get());
    }
}