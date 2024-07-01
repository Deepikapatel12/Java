class Deletemultichar{
	public static void main(String args[]){
	StringBuffer str=new StringBuffer("welcome");
	System.out.println("Befor delete :"+str);
	str.delete(2,5);
	
	System.out.println("Afterdelete :"+str);
	}
}