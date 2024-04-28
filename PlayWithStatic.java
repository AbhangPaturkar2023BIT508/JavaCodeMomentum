class PlayWithStatic{
	int balance;
	static String surname;
	
	public static void main(String args[]){
		PlayWithStatic obj = new PlayWithStatic("Hi");
		
		System.out.println(obj.balance);
		System.out.println(obj.surname);
		//System.out.println(surname);
		
		//obj.balance = 2300;
		//obj.surname = "Hello";
		//surname = "World";
		//System.out.println(obj.balance);
		//System.out.println(obj.surname);
		//System.out.println(surname);
		
		//PlayWithStatic obj1 = new PlayWithStatic();
		//System.out.println(obj1.balance);
		//System.out.println(obj1.surname);
		//System.out.println(surname);
		
		//System.out.println(obj1.getBalance(obj1));
		//System.out.println(PlayWithStatic.getBalance(obj1));
		
		//System.out.println(obj1.getBalance(obj));
		//System.out.println(PlayWithStatic.getBalance(obj));
		//System.out.println(surname.length());
		
		
	}
	
	public static PlayWithStatic(String sn){
		//balance = 222;
		surname = sn;
	}
	
	
}
