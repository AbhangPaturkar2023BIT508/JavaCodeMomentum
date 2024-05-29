class FileExample{
	public static void main(String arg[])throws Exception{
		System.out.println("HI....");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.io.File file = new java.io.File("xyz.txt");
		file.createNewFile();
		
 	}

}
