import java.util.Scanner;
class Ifelse{
	public static void main(String args[]){
	int n;
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter any Number  :");
	n=kb.nextInt();
	if(n%2==0){
	System.out.println("This is Even Number");
	}
	else{
	System.out.println("This is Odd Number");
	}
	}
}
	