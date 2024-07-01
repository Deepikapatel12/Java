import java.util.Scanner;
class Vowelcons{
	public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	char ch;
	System.out.println("Enter First Character :");
	 ch=scanner.next().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	{
	System.out.println("It is an Vowel");
	}
	else{
	System.out.println("It is not vowel");
	}
	
	
	
	}
}