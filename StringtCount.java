class StringtCount{
	
	public static void main(String args[]){
	String a="Welcome to w3resource.com";
	int alphabet=0;
	int digit=0;
	int sp=0;
	for(int i=0;i<a.length();i++){
	char ch=a.charAt(i);
	if(Character.isLetter(ch)){
	alphabet++;}
	else if(Character.isDigit(ch)){
	digit++;
	}
	else if(!Character.isWhitespace(ch)){
	sp++;
	}
	}
	System.out.println(alphabet);
	System.out.println(digit);
	System.out.println(sp);
	}
}




