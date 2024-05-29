class Year{
	final int totalStudents;
	int studentsRegNumbers[];
	final int regularStudernts;
	final int dsyStudernts;
	final int tfwsStudernts; 
	Year(int totalStudents, int regularStudernts, int tfwsStudernts, int dsyStudernts){
		this.totalStudents = totalStudents;
		this.regularStudernts = regularStudernts;
		this.tfwsStudernts = tfwsStudernts;
		this.dsyStudernts = dsyStudernts;
		generateStudentsRegNumbers();	
	}
	
	private void generateStudentsRegNumbers(){
		studentsRegNumbers = new int[totalStudents];
		int i = 0, j = 151, k = 501;
		for(;i<totalStudents; i++){
			if(i<regularStudernts){
				studentsRegNumbers[i] = i+1;
			}
			else if(j<=150+tfwsStudernts){
				studentsRegNumbers[i] = j;
				j++;
			}
			else if(k<=500+dsyStudernts){
				//Sy	
				studentsRegNumbers[i] = k;
				k++;
			}
		}
	}
		
	int selectStudentRandomly(){
		return studentsRegNumbers[(int)(System.nanoTime()%totalStudents)];
	}
	
	public static void main(String args[]){
		Year inftSY = new Year(78, 64, 3, 11);
		//inftSY.displayStudentsRegNumbers();
		System.out.println(inftSY.selectStudentRandomly());
	}
	
}
