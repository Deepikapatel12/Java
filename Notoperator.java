class Notoperator{
	public static void main(String argd[]){
	int a,b,c,d;
	a=10;
	b=20;
	c=30;
	d=40;
	
	boolean r=!(a<b && c<d);
	//10<20 && 30<40
	//t&&t-----!f
	System.out.println(r);//false
	}
}