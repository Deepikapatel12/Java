import java.util.Scanner;
class RectangleByfunction{
	int l;
	int b;
	//instance variable
	public void getData(){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter length :");
	l=kb.nextInt();
	System.out.println("Enter Breadth :");
	b=kb.nextInt();
	}
	
	public void showData(){
	System.out.println("length is :"+l);
	System.out.println("Breadth is :"+b);
	}

	public void getArea(){
	System.out.println("Area of Reactangle : "+(l+b));
	}

	public void getPara(){
	System.out.println("Parameter of Rectangle : "+2*(l+b));
	
	//membre function
	}
	public static void main(String args[]){
	RectangleByfunction r= new RectangleByfunction();//r is an object of Rectangle //class
	r.getData();
	r.showData();
	r.getArea();
	r.getPara();
	}
	}

	