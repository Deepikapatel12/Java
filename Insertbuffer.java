class Insertbuffer{
	public static void main(String args[]){
	StringBuffer str=new StringBuffer("welcome bhopal");
	System.out.println("Befor insert :"+str);
	str.insert(8,"To ");
	System.out.println("After insert :"+str);
	}
}