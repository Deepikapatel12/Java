//Taking somthing returning somthing
import java.util.Scanner;
class TakingReturning{
	public static int add(int a,int b){//formal argument
	return a+b;
	}
	
	public static void main(String args[]){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enetr Number 1 :");
	int x=kb.nextInt();
	System.out.println("Enetr Number 2 :");
	int y=kb.nextInt();
	int result=add(x,y);//Actual Argument
	System.out.println("Addition :"+result);
	}
	}