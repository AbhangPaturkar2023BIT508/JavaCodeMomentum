
// package ExamPre;
import java.util.Scanner;

class InvalidVoterException extends RuntimeException {
    public InvalidVoterException(String msg) {
        super(msg);
    }
}

public class CustomExcep {

    static void myMethod(int a) throws InvalidVoterException{
        // try {
            if (a < 18) {
                throw new InvalidVoterException("Vay");
            } else {
                System.out.println("asdfh");
            }
        // } catch (InvalidVoterException e) {
        //     System.out.println(e.getMessage());
        // }
    }

    public static void main(String[] args){
        myMethod(20);

    }
}
