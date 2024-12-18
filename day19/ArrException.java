package day19;

public class ArrException {

	public static void main(String[] args) {
		
		 int arr[]= new int[5];
	arr[0]= 100;
	arr[1]= 200;
	arr[2]= 300;
	arr[3]= 400;
	arr[4]= 500;
	try {
		arr[5]=600;
	}catch(Exception e)
	{
		System.out.println(e);
	}
	for(int i = 0; i<=4;i++) {
		System.out.println(arr[i]);
	}
	for(int arr1 : arr) {
		System.out.println(arr1);
	}
	}
	
}

