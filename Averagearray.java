import java.util.Scanner;
class Averagearray{
	public static void main(String args[]){
	int arr[]=new int[5];
	int i,sum=0;
	Scanner sk=new Scanner(System.in);
	for(i=0;i<arr.length;i++)
	{
	System.out.println("Enter Index of "+i+" : ");
	arr[i]=sk.nextInt();
	sum=sum+arr[i];
	}
	System.out.println("sum :"+sum);
	System.out.println("sum : "+sum/arr.length);
	}	
	}