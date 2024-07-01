import java.util.Scanner;
class CircleByfunction{
	float r;
	
	public void acceptData(){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter Radious :");
	r=kb.nextFloat();
	}
	public void getData(){
	System.out.println("radious :"+r);
	}
	
	public void display(){
	System.out.println("area of circle :"+3.14);
	}

	public void getCirc(){
	System.out.println("Circumference of circle :"+2*3.14*r);
	}

	public static void main(String args[]){
	CircleByfunction c=new CircleByfunction();
	c.acceptData();
	c.display();
	c.getData();
	c.getCirc();
	}
	}