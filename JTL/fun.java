class FFirst {

	int x;

	FFirst(int x) {
		FFirst.this.x = x;
	}

	public static void main(String... args) {
		try {
			System.out.println(args[0]);
			FFirst f = new FFirst(45);
			System.gc();
			f = new FFirst(45);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception at line number 5!!!");
		} finally {
			System.out.println("End of FFirst!");
		}
	}
}
