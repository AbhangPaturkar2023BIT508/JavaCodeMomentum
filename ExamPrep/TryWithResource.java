import java.io.PrintWriter;

public class TryWithResource {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("abc.txt"); ) {
            pw.write("null");
        } catch (Exception e) {
            System.out.println("jo");
        } 
        // finally {
        //     System.out.println("adsf");
        // }
    }
}
