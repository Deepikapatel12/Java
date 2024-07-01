class Trimmethod{
	public static void main(String args[]){
	//it only remove starting and endig spaces only
	String str="  Hello  World  ";
	System.out.println("Length Before trim :"+str.length());
	String a=str.trim();
	System.out.println("Length After Trim :"+a.length());
	}
}