//Taking Nothing Returning Nothing 
import java.util.Scanner;
class FunctionmethodFirsttype{
	public static void add(){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter Number 1: ");
	int n1=kb.nextInt();
	
	System.out.println("Enter Number 2: ");
	int n2=kb.nextInt();

	int n3=n1+n2;
	System.out.println("Addition : "+n3);

	}
	
	public static void main(String args[]){
	add();
	}
	}