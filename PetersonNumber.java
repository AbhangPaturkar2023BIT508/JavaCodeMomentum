import java.util.Scanner;

class Peterson {
    // Number = 145

    // 145 = !1 + !4 + !5

    // =1+4*3*2*1+5*4*3*2*1

    // =1+24+120

    // 145=145
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number to check peterson or not : ");
        int num = scan.nextInt();
        int digitFactSum = 0;
        int tempNum = num;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            int digitFact = 1;
            for (int i = 1; i <= digit; i++) {
                digitFact = digitFact * i;
            }
            digitFactSum = digitFactSum + digitFact;
            tempNum = tempNum / 10;
        }

        System.out.println("Sum of factorial of each digit of " + num + " is " + digitFactSum);
        if (num == digitFactSum) {
            System.out.println("Number is Peterson Number");
        } else {
            System.out.println("Number is not a Peterson Number");
        }
        scan.close();
    }
}