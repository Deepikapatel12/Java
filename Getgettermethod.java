/*class Getgettermethod{
	private int rollno=10;//instance variable
	private float per=78.50f;//inatance variable
	private String name="Deepika";//instance variable

	public int getRollNo(){
	return rollno;
	}

	public float getPer(){
	return per;
	}
	
	public String getName(){
	return name;
	} 
	public void setName(String name){
	this.name=name;
	}
	public void setRollNo(int rollno){
	this.rollno=rollno;
	}
	public void setPer(float per){
	this.per=per;
	}

	}
	
	class T1{
	public static void main(String args[]){
	Getgettermethod t=new Getgettermethod();
	t.setRollNo(101);
	t.setPer(56.56f);
	t.setName("deepak");
	System.out.println(t.getRollNo());
	System.out.println(t.getPer());
	System.out.println(t.getName());
	
	}
	}
		*/











class Test{
private int rollno=10;//instance variable
private float per=78.50f;//instance variable

private String name="deepika";//instance variable
public int getRollNo(){
return rollno;
}
public float getPer(){
return per;
}
public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}
public void setRollNo(int rollno){
this.rollno=rollno;
}
public void setPer(float per){
this.per=per;
}
}
class T1{
public static void main(String args[]){
Test t=new Test();
t.setRollNo(101);
t.setPer(56.56f);
t.setName("deepak");
System.out.println(t.getRollNo());
System.out.println(t.getPer());
System.out.println(t.getName());
}
}