class VerifyRegNo{
	
	public boolean verifyRegistrationNumber(String regNo){
		if(regNo.length() != 10){
			return false;
		}else{
			for(int i = 0; i < 4; i++){
				if(!Character.isDigit(regNo.charAt(i))){
					return false;
				}
			}
			
			for(int i = 4; i < 7; i++){
				if(!Character.isUpperCase(regNo.charAt(i))){
					return false;
				}
			}
			
			for(int i = 7; i < 10; i++){
				if(!Character.isDigit(regNo.charAt(i))){
					return false;
				}
			}
			
			return true;
		}
	}

	public static void main(String args[]){
		String a = "2023BIT508";
		String b = "";
		String c = "           ";
		String d = "2023BiT508";
		String e = "2023bit508";
		String f = "2023B2T508";
		
		
		VerifyRegNo obj = new VerifyRegNo();
		System.out.println(obj.verifyRegistrationNumber(a));
		System.out.println(obj.verifyRegistrationNumber(b));
		System.out.println(obj.verifyRegistrationNumber(c));
		System.out.println(obj.verifyRegistrationNumber(d));
		System.out.println(obj.verifyRegistrationNumber(e));
		System.out.println(obj.verifyRegistrationNumber(f));
		
	}
}
