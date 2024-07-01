class Deletemethod{
	public static void main(String args[]){
	StringBuffer str=new StringBuffer("welcome");
	System.out.println("Befor delete :"+str);
	for(int i=0;i<str.length();i++){
	char c=str.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	str.delete(i,i+1);
}
}
	
	System.out.println("After delete :"+str);
	}
}