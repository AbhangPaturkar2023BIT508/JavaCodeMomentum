import java.util.Scanner;

class CountTotalCharInString{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Text to count char : ");
		String text = scan.nextLine();
		int count = 0;
		
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i)!=' '){
				count++;
			}
		}
		
		System.out.println("Total Number of Character in Given Text : "+count);
		scan.close();
	}
}
