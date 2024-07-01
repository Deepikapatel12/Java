class TaskStringlength{
	public static void main(String args[]){
	String x="aabbcc";
	String y="abcdef";//"aabbcc";
	int a=y.length();
	int b=x.length();
	if(x==y){
	System.out.println("Strings are equal");
	}
	else{
	System.out.println("Strings are not equal");
	}
	System.out.println("length of string :"+b);
	System.out.println("length of string :"+a);
	}
}