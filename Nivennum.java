class Nivennum{
	public static void main(String args[]){
	
	int num=126;
	int num1=num;
	int sum=0;

	while(num!=0)
	{
	sum=sum+num%10;
	num=num/10;
	}
	if(num1%sum==0)
	{
	System.out.println("niven");
	}
	else{
	System.out.println("not");
	}
	}	}
	