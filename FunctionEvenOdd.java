//Taking Nothing Returning Nothing 
import java.util.Scanner;
class FunctionEvenOdd{
	public static void evenodd(){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter Number 1: ");
	int n=kb.nextInt();
	if(n%2==0){
	System.out.println("This is Even number");
	}
	else{
	System.out.println("This IS Odd Number");
	}
	
	}
	
	public static void main(String args[]){
	evenodd();
	}
	}