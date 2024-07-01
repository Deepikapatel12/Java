class Doublequals{
	public static void main(String args[]){
	String a=new String("hello");
	String b=new String("hello");
	String c=b;
	System.out.println(a==b);//false
	System.out.println(a.equals(b));//true
	System.out.println(c==b);//true
	}
}