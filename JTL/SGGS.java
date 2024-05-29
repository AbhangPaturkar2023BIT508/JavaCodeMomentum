class College{

	String name;
	
	College(String collegeName){
		College.this.name = collegeName;
	}
	
	class Department{
		String name;
	
		Department(String deptName){
			this.name = deptName;
		}
		
		String getDeptDetails(String name){
			return  name+" in \nCollege Name:"+ College.this.name +"\nDeptName:"+this.name;		
		}
	
	}	
	
	static public void main(String args[]){
		College sggs1 = new College("SGGS Uni");
		Department dept = sggs1.new Department("IT Dept");
		System.out.println(dept.getDeptDetails("Fun"));			
	}
}

