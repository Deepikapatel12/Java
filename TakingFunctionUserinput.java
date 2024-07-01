//taking somthing returning nothing
import java.util.Scanner;
class TakingFunctionUserinput{

	public static void printTable(int n){//formal Argument

	for(int i=1;i<=10;i++){

	System.out.printf("\n%d * %d = %d",n,i,n*i);	
	}
	}
	public static void main(String args[]){
	Scanner sk=new Scanner(System.in);
	System.out.println("Enetr Number ");
	int a=sk.nextInt();
	printTable(a);//Actual Argument
	}
	}