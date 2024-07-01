class Replacemethod{
	public static void main(String args[]){
	StringBuffer str=new StringBuffer("welcome");
	System.out.println("Befor replace :"+str);
	str.replace(3,7,"done");
	System.out.println("After replace :"+str);
	}
}