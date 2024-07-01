import java.util.Scanner;
class Ifpn{
	public static void main(String args[]){
	int n;
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter Any Number :");
	n=kb.nextInt();
	if(n>0){
	System.out.println("This is positive number");
	}
	if(n<0){
	System.out.println("This is Negative number");
	}
	}
}