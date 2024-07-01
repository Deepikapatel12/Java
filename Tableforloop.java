import java.util.Scanner;
class Tableforloop{
	public static void main(String args[]){
	int i,n;
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter any number :");
	n=sk.nextInt();
	System.out.println("====================");
	for(i=1;i<=10;i++){
	System.out.println(n*i);
	}
}
}