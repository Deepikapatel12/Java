import java.util.Scanner;
class Upperlower{
	public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	char ch;
	System.out.println("Enter First Character :");
	 ch=scanner.next().charAt(0);
	if(ch>='a'){//condition_1
		if(ch<='z'){//condition_1_1
	System.out.println("Lower Case");
	}
	}
	else if(ch>='A'){//condition_2
		if(ch<='Z'){//condition_2_2
	System.out.println("Upper Case");
	}
	}
	
	
	
	}
}