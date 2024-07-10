class Finalvariable{
	final int X;//final variable
	public Finalvariable(){
		X=20;
	}
	
	}
	class Hello extends Finalvariable{
		
	public void show(){
		System.out.println("This is Parent class show : "+X);
	}
	
	public static void main(String args[]){
	
	final int b=10;
	Hello t=new Hello();
	System.out.println("final local variable : "+b);  
	t.show();
	}
}