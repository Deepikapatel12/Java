class Recursion{
	public static int fact(int n){//5,4,3,2,1
	
	if(n==1){
	return 1;
	}
	else{
	return n*fact(n-1);
	}
	}
	public static void main(String args[]){
	System.out.println("factorial :"+fact(5));
	}
	}