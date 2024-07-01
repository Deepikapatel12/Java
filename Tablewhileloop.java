import java.util.Scanner;
class Tablewhileloop{
	public static void main(String args[]){
	int i,n;
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter any number :");
	n=sk.nextInt();
	System.out.println("====================");
	i=1;
	while(i<=10){
	System.out.println(n*i);
	i++;
	}
}
}