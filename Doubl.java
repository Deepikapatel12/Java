//step: import scanner class


import java.util.Scanner;
class Doubl{
	public static void main(String args[]){	
	double r,ar,cr;
	//step2:
	
	Scanner obj=new Scanner(System.in);
//step3:
	System.out.println("Enter Radius :");
	r=obj.nextDouble();
	ar=3.14f*r*r;
	cr=2*3.14f*r;
	System.out.println("Area of circle : "+ar);
	System.out.println("Circumference of Circle :"+cr);
	}
}