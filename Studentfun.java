import java.util.Scanner;
class Studentfun{
 String name;
   String enroll;
  float per;
    int roll;
   char section;
   int p;
int c;
int m;
int h;
int e;
public void getData(){
  Scanner sk=new Scanner(System.in);
   System.out.println("enter a student name :");
  name=sk.nextLine();
   System.out.println("enter a enroll no.");
   enroll=sk.nextLine();
   System.out.println("enter roll :");
   roll=sk.nextInt();
   System.out.println("enter section :");
   section=sk.next().charAt(0);
  System.out.println("enter a marks of physice");
  p=sk.nextInt();
  System.out.println("enter a marks of chemistry");
  c=sk.nextInt();
  System.out.println("enter a marks of maths");
  m=sk.nextInt();
  System.out.println("enter a marks of hindi ");
  h=sk.nextInt();
  System.out.println("enter a marks of english ");
  e=sk.nextInt();
}
public void showData(){
 System.out.println("name :"+name);
System.out.println("enroll :"+enroll);
System.out.println("roll :"+roll);
System.out.println("section :"+section);
System.out.println("physcs marks :"+p);
System.out.println("Chemistry marks :"+c);
System.out.println("Maths marks :"+m);
System.out.println("Hindi marks :"+h);
System.out.println("English marks :"+e);
}


public void totalMarks(){
System.out.println("total marks :"+(p+c+m+h+e));
}
public void getPer(){
System.out.println("percentage :"+(p+c+m+e+h)/5);
}
public static void main(String args[]){
Studentfun s=new Studentfun();
s.getData();
s.showData();
s.totalMarks();
s.getPer();
}
}