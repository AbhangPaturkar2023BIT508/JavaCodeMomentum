import java.io.IOException;

public class Excep { 
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[50] = 10;

        } catch (NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
