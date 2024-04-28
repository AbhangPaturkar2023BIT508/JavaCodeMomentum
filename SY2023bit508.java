class SY2023bit508{
	// Display element of array
	public void task1(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	// Return First Element of array
	public int task2(int arr[]){
		int firstEle = arr[0];
		return firstEle;
	}	
	
	// Return Last Element of array	
	public int task3(int arr[]){
		int lastEle = arr[arr.length-1];
		return(lastEle);
	}
	
	// Return Second Last Element of array	
	public int task4(int arr[]){
		int secLastEle = arr[arr.length-2];
		return(secLastEle);
	}
	
	// Return sum of all Element of array	
	public int task5(int arr[]){
		int sum = 0;
		for(int i = 0; i < arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String args[]){
		int a[] = {};
		SY2023bit508 obj = new SY2023bit508();
		
		obj.task1(a);
		
		System.out.println(obj.task2(a));
		System.out.println(obj.task3(a));
		System.out.println(obj.task4(a));
		System.out.println(obj.task5(a));
	}
}
