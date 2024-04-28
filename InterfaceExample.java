interface University{
	int studMinAge = 18;
	void endTermExam(String dept[]);
	//int University(int a, int b, int c);
}

class GPA{
	int deptCount;
	GPA(int dc){
		this.deptCount = dc;
		
	}
	class Inner implements University{
		Inner(){
			System.out.println("COnst Inner");
		}
	}
	

}

class Fun{
	public static void main(String ...args){
		GPA obj = new GPA(5);
		
	}
}
