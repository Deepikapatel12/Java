import java.util.Scanner;
class Oddeleinarray{
	public static void main(String args[]){
	int arr[]=new int[5];
	int i,sum=0;
	Scanner sk=new Scanner(System.in);
	for(i=0;i<arr.length;i++)
	{
	System.out.println("Enter Index of "+i+" : ");
	arr[i]=sk.nextInt();
	if(arr[i]%2!=0){
	sum=sum+arr[i];
	}
	}
	System.out.println("sum of all odd elements  :"+sum);
	
	}	
	}