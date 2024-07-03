class A{
	int x=10;
	public A(){
		System.out.println("This is A class Default Constructer");
	}
	public A(int x){
	this.x=x;
		System.out.println("This is A class Parametrized constructer");
	}

	}
	
	class B extends A{
	int y=20;
	public B(){
		
	System.out.println("this is B class Default cnstrucer");
	}
	public B(int x, int y){
	super(x);
	this.y=y;
		System.out.println("This is B class Parametrized constructer");
	}
	public void show(){
		System.out.println("This is A Parent X: "+super.x);
		System.out.println("This is B child class x: "+y);
		}

	}
	
	class C extends B{
	int z=30;
	public C(){
	System.out.println("this is C class Default constructer");
	}
	public C(int x, int y, int z){
	super(x,y);
	this.z=z;
	System.out.println("This is C class parametrized constructer");
	}
	public void show(){
	super.show();//to call parent class parent class method
	System.out.println("this is C child "+z);
	}
	public static void main(String args[]){
	C obj=new C(1,2,3);
	obj.show();
	}

	}