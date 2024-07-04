class Methodoverloading{
	public void add(){
	int a,b,c;
	a=10;
	b=20;
	c=a+b;
	System.out.println("Additon without argument"+c);
	}


	public int add(int a, int b){
	int c;
	a=10;
	b=20;
	c=a+b;
	System.out.println("Addition with two int argument"+c);
	return c;
	}
	
	public void add(float a, float b){
	float c=a+b;
	System.out.println("Add two float"+c);
	}
	
	public void add(String a, String b){
	int c=Integer.parsetInt(a)+Integer.parseInt(b);
	System.out.println("Add two String:"+c);
	
	}
	
	public static void main(string args[]){
	Methodoverloading=new Methodoverloading();
	Methodoverloading.add();
	Methodoverloading.add(5,7);
	Methodoverloading.add(12.5,34.5);
	Methodoverloading.add(2.5f,4.5f);
	methodoverloading.add("1","1");
	
		}
}
	