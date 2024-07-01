import java.util.Scanner;
class Student1{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Name : ");
	String name=scan.nextLine();
	System .out.println("Enter Section : ");
	char s=scan.next().charAt(0);

	System.out.println("Name : "+name);
	System.out.println("Section : "+s);
	}	
}