import java.util.Scanner;
class Namearraystring{
	public static void main(String args[]){
	
	String arr[]=new String[5];
	int i;

	Scanner sk=new Scanner(System.in);
	for(i=0;i<arr.length;i++){	
	System.out.println("Enter the elements of "+i+" :");
	arr[i]=sk.nextLine();
	}
	
	System.out.println("Elements of the array :");
	for(i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}
	}
}