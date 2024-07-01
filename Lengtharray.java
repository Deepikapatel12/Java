import java.util.Scanner;
class Lengtharray{
	public static void main(String args[]){
	
	int arr[]=new int[5];
	int i;

	Scanner sk=new Scanner(System.in);
	for(i=0;i<arr.length;i++){	
	System.out.println("Enter the elements of "+i+" :");
	arr[i]=sk.nextInt();
	}
	
	System.out.println("Elements of the array :");
	for(i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}
	}
}