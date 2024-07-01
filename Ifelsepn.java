import java.util.Scanner;
class Ifelsepn{
	public static void main(String args[]){
	int n;
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter any Number  :");
	n=kb.nextInt();
	if(n>=0){
	System.out.println("Given Number is psitive");
	}
	else{
	System.out.println("Given Number is Negative");
	}
	}
}