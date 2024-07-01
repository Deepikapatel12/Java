class Deletechar{
	public static void main(String args[]){
	StringBuffer str=new StringBuffer("welcome");
	System.out.println("Befor delete :"+str);
	str.deleteCharAt(2);//specific character delete from index value
	
	System.out.println("Afterdelete :"+str);
	}
}