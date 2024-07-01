import java.util.Scanner;
class R{
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	int l,b,area;
	System.out.println("Enter length : ");
	l=obj.nextInt();
	
	System.out.println("Enter Breadth :");
	b=obj.nextInt();

	area=l*b;
	System.out.println("Area of Recatngle : "+area);
	}
}