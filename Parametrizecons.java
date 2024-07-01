 class Parametrizecons{
	//DEfault constructer with parametre
	String name;
	float sal;
	int deptno;
	
	public Parametrizecons(String n, float s, int d){
	System.out.println("Parametrized constructer ");
	name=n;
	sal=s;
	deptno=d;
	}
	
	public void showData(){
	System.out.println("Name : "+name);
	System.out.println("Salary :"+sal);
	System.out.println("Department number :"+deptno);
	}
	 
	public static void main(String args[]){
	Parametrizecons e=new Parametrizecons("Ram",12345,10);
	e.showData();
	Parametrizecons e2=new Parametrizecons("Deepak",2347837,20);
	e2.showData();
	Parametrizecons e3=new Parametrizecons("Sanjay",87469,30);
	e3.showData();

	}
	}