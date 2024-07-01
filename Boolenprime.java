class Boolenprime{
	public static boolean isPrime(int n){
	int count=0;
	for(int i=1;i<=n;i++){
	if(n%i==0){
	count++;
	}
	}

	if(count==2){
	return true;
	}
	else{
	return false;
	}
}
	public static void main(String args[]){
	int n=5;
	int countp=0;
	for(int i=1;i<=n;i++){
	if(isPrime(i)){
	countp++;
	}
	}
	System.out.println(countp);
	}
}