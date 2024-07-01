//taking nothing returning somthing
import java.util.Scanner;
class Returningsomthing{
	
	public static int add(){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enetr Number 1 :");
	int a=kb.nextInt();
	System.out.println("Enetr Number 2 :");
	int b=kb.nextInt();
	
	int c=a+b;
	return c;
	}
	
	public static void main(String args[]){
	int result=add();
	System.out.println("Addition :"+result);
	}
	}