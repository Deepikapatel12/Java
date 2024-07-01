import java.util.Scanner;
class Double1{
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	double r,area,cr;
	System.out.println("Enter Radius : ");
	r=obj.nextDouble();

	area=3.14*r*r;
	cr=2*3.14*r;
	
	
	System.out.println("Area of Circle : "+area);
	System.out.println("Circumfrence of circle : "+cr);
	}
}