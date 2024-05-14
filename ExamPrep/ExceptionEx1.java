import java.io.PrintWriter;

public class ExceptionEx1 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("hello");
    }
    // public static void main(String[] args) {
    //     System.out.println("main : hello");
    //     doStuff();
    //     System.out.println("Main : end");
    // }

    // public static void doStuff() {
    //     try {

    //         doMoreStuff();
    //     } 
    //     finally{
            
    //     }
    //     // catch (Exception e) {
    //     //     e.printStackTrace();
    //     // }
    // }

    // public static void doMoreStuff() {
    //     // try {

    //     System.out.println(10 / 0);
    //     // } catch (Exception e) {
    //     // e.printStackTrace();
    //     // }
    // }
}
