class Staticmethod{
String name="Akash";
static String collegeName;
private static int count=0;
public static int getCount(){
return count;
}
public Staticmethod(){
count++;
}

public Staticmethod(String name){
this.name=name;
count++;
}

static{
System.out.println("This is Static Block 2");
}

static{
System.out.println("This is Static Block 1");

collegeName="LNCT";
}
public static void main(String args[]){
System.out.println("This is Main Method");
Staticmethod s1=new Staticmethod();
Staticmethod s2=new Staticmethod("Akash");

Staticmethod s3=new Staticmethod();
System.out.println("Number of Object created : "+Staticmethod.getCount());
System.out.println("Number of Object created : "+getCount());
System.out.println("Number of Object created : "+s1.getCount());
System.out.println("College Name : "+collegeName);

}

}