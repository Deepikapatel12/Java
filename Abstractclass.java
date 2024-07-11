abstract class RGPV{
	public abstract void lab();
	public abstract void cctv();
	//abstract class 

	public void examCopyCheck(){
		System.out.println("This is RGPV non abstract method");
	}
	
	public RGPV(){
	System.out.println("This is RGPV Constructer");
	}
	}

	class Collage extends RGPV{
		public void cctv(){
		System.out.println("This is CCTV method Rule by RGPV");
	}
	public void lab(){
	System.out.println("This is lab method Rule by rgpv");
	}

	public void staff(){
		System.out.println("THis is collage class staff method");
	}
		
	public Collage(){
	System.out.println("this is collage class contructer");
	}
	
	public static void main(String args[]){
	//RGPV obj=new RGPV();//COMPILE TIME ERROR 
	
	RGPV obj=new Collage();
	obj.cctv();
	obj.lab();
	obj.examCopyCheck();
	//obj.staff();
	Collage c=new Collage();
	c.cctv();
	c.lab();
	c.examCopyCheck();
	c.staff();


		//compile javac Abstractclass.java
		//java Collage
	//main method class call
	}
	}