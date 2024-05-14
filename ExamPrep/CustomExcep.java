package ExamPre;
import java.util.Scanner;

class InvalidVoterException extends Exception {
    public InvalidVoterException(String msg) {
        super(msg);
    }
}
// class sam extends DefaultExceptionHandler{

// }
public class CustomExcep {
    public static void main(String[] args) throws InvalidVoterException {
        Scanner scan = new Scanner(System.in);
        if (scan.nextInt() < 18) {
            throw new InvalidVoterException("Invalid Age For Voting");
        }
    }
}
