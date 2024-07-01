//step: import scanner class


import java.util.Scanner;
class Add{
	public static void main(String args[]){
	//step2:
	
	Scanner kb=new Scanner(System.in);
//step3:
	System.out.println("Enter First Number :");
	int n1=kb.nextInt();
	System.out.println("Enter Second Number :");
	int n2=kb.nextInt();
	
	int n3=n1+n2;
	System.out.println("Addition :"+n3);
	}
}