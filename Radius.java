import java.util.Scanner;
class Radius{
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	float r,area,cr;
	System.out.println("Enter Radius : ");
	r=obj.nextFloat();

	area=3.14f*r*r;
	cr=2*3.14f*r;
	
	
	System.out.println("Area of Circle : "+area);
	System.out.println("Circumfrence of circle : "+cr);
	}
}