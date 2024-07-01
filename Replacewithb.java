class Replacewithb{
	public static void main(String args[]){
	StringBuffer str=new StringBuffer("welcome");
	System.out.println("Befor replace :"+str);
	for(int i=0;i<str.length();i++){
	char c=str.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	str.replace(i,i+1,"b");
}
}
	
	System.out.println("After replace :"+str);
	}
}