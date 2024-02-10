interface Voter{
	void castVote();
}

interface EC{
	void checkValidityOfVoter(int age) throws Exception;
}

class ECIndia implements Voter, EC{
	final int minAge;
	
	ECIndia(int minAge){
		this.minAge = minAge;
	}
	
	public void castVote(){
		System.out.println("castVote Success...");
	}
	
	public void checkValidityOfVoter(int age) throws InvalidVoterAgeException{
		try{
			if(age < minAge){
				throw new InvalidVoterAgeException("Invalid Voter");
			}else{
				castVote();
			}		
		}catch(InvalidVoterAgeException e){
			age += 18;
			checkValidityOfVoter(age);
		}
	}
}

class InvalidVoterAgeException extends Exception{
	InvalidVoterAgeException(String errMsg){
		super(errMsg);
		//System.out.println(errMsg);
	}
	
	void ageErrorHandler(){
		System.out.println("ageErrorHandler()  called");
	}
}	



class Fun{
	public static void main(String ...args) throws Exception{
		ECIndia ecindia = new ECIndia(18);
		ecindia.checkValidityOfVoter(5);
	}
}
