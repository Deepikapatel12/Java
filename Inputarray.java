import java.util.Scanner;
class Inputarray{
	public static void main(String args[]){
	
	int arr[]=new int[5];
	Scanner sk=new Scanner(System.in);

	System.out.println("Enter Elements of Index 0 :");
	arr[0]=sk.nextInt();
	System.out.println("Enter Elements of Index 1 :");
	arr[1]=sk.nextInt();
	System.out.println("Enter Elements of Index 2 :");
	arr[2]=sk.nextInt();
	System.out.println("Enter Elements of Index 3 :");
	arr[3]=sk.nextInt();
	System.out.println("Enter Elements of Index 4 :");
	arr[4]=sk.nextInt();

	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	}
} 