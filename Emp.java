 class Emp{
	//DEfault constructer without parametre
	String name;
	float sal;
	int deptno;
	
	public Emp(){
	System.out.println("Defult constructer is called");
	name="guest";
	sal=1000;
	deptno=10;
	}
	
	public void showData(){
	System.out.println("Name : "+name);
	System.out.println("Salary :"+sal);
	System.out.println("Department number :"+deptno);
	}
	
	public static void main(String args[]){
	Emp e=new Emp();
	e.showData();
	Emp e2=new Emp();
	e2.showData();

	}
	}