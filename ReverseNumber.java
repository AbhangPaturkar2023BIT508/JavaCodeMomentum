import java.util.Scanner;

class ReverseNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scan.nextInt();
		scan.close():
		int temp = num;
		int revNum = 0;
		while(temp > 0){
			int digit = temp % 10;
			revNum = 10 * revNum + digit;
			temp /= 10;
		}
		
		System.out.println(revNum+" is reverse of "+num);
	}
	
}
