import java.util.Scanner;

class InvalidAvatar extends Exception {
    public InvalidAvatar(String msg) {
        super(msg);
    }
}

public class ExceptionExample {
    public static void main(String[] args) throws InvalidAvatar {
        Scanner scan = new Scanner(System.in);
        try {
            if (scan.nextInt() != 0) {
                throw new InvalidAvatar("Exception");
            } else {
                System.out.println("0-zero ");
            }
        } catch (InvalidAvatar e) {
            e.printStackTrace();
        } finally {
            System.out.println("me finally");
        }

    }
}
