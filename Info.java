import java.util.Scanner;
class Info{
	public static void main(String args[]){
	//step2
	Scanner sk=new Scanner(System.in);
	//step3
	System.out.println("Enter Name :");
	String name=sk.nextLine();
	
	System.out.println("Enter Section :");
	char s=sk.next().charAt(0);

	System.out.println("Enter Address :");
	String ad=sk.next();

	System.out.println("Name :"+name);
	System.out.println("Section :"+s);
	System.out.println("Address :"+ad);
	}
}