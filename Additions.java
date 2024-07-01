import java.util.Scanner;
class Additions{
	public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter First Number :");
	int a=scanner.nextInt();
	System.out.println("Enter Second Number :");
	int b=scanner.nextInt();
	int sum=a+b;
	int subtract=a-b;
	int multiply=a*b;
	int divide=a/b;
	int mod=a%b;
	
	
	
	
	System.out.println("Product of Two numbers is :"+sum);
	System.out.println("Product of Two numbers is :"+subtract);
	System.out.println("Product of Two numbers is :"+multiply);
	System.out.println("Product of Two numbers is :"+divide);
	System.out.println("Product of Two numbers is :"+mod);
	
	}
}