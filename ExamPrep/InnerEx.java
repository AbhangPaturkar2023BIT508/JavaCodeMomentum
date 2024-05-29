
class Outer{
    int a;

    Outer(){
        System.out.println("outer con");
        // this.b=10;
        new Inner().b = 10;
    }

    // static{
    //     System.out.println("Outer : static");
    //     // Inner obj = new Inner();
    // }

    class Inner{
        int b;

        Inner(int i){
            System.out.println("inner con");
            Outer.this.a=10;
        }   
        // static{
        //     System.out.println("Inner : static");
        // }
    }
}


class InnerEx{
    public static void main(String[] args) {
        Outer o = new Outer();
        // Outer.Inner obj = o.new Inner();
    }
}