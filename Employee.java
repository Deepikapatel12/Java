import java.util.Scanner;
class Employee{
	public static void main(String args[]){
	//step2
	Scanner sk=new Scanner(System.in);
	//step3
	System.out.println("Enter Name :");
	String name=sk.nextLine();
	
	System.out.println("Enter Salary :");
	float s=sk.nextFloat();
	sk.nextLine();
	
	System.out.println("Enter Job Profile :");
	String jp=sk.nextLine();

	System.out.println("Enter EmpNo :");
	int e=sk.nextInt();
	
	System.out.println("Enter Dept No :");
	int d=sk.nextInt();

 	System.out.println("Enter Grade :");
	char c=sk.next().charAt(0);

	System.out.println("Name :"+name);
	System.out.println("Salary :"+s);
	System.out.println("Address :"+jp);
	System.out.println("EmpNo :"+e);
	System.out.println("DeptNo :"+d);
	System.out.println("Section :"+c);
	}
}