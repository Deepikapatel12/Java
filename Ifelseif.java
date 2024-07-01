import java.util.Scanner;
class Ifelseif{
	public static void main(String args[]){
	char ch;
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter any Number  :");
	ch=kb.next().charAt(0);
	if(ch>='a' && ch<='z'){
	System.out.println("This is lowercase Character");
	}
	else if(ch>='A' && ch<='Z'){
	System.out.println("This is Uppercase Character");
	}
	else if(ch>='0' && ch<='9'){
	System.out.println("This is digit");
	}
	else{
	System.out.println("This is Special Character");
	}
	}
}