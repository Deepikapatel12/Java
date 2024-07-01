import java.util.Scanner;
class TwoDuserinput{
	public static void main(String args[]){
	int A[][]=new int[3][3];
	Scanner obj=new Scanner(System.in);

	System.out.println("Enter Index 00 :");
	A[0][0]=obj.nextInt();
	System.out.println("Enter Index 01 :");
	A[0][1]=obj.nextInt();
	System.out.println("Enter Index 02 :");
	A[0][2]=obj.nextInt();

	System.out.println("Enter Index 10 :");
	A[1][0]=obj.nextInt();
	System.out.println("Enter Index 11 :");
	A[1][1]=obj.nextInt();
	System.out.println("Enter Index 12 :");
	A[1][2]=obj.nextInt();

	System.out.println("Enter Index 20 :");
	A[2][0]=obj.nextInt();
	System.out.println("Enter Index 21 :");
	A[1][1]=obj.nextInt();
	System.out.println("Enter Index 22 :");
	A[2][2]=obj.nextInt();
	
	System.out.println(A[0][0]+"\t"+A[0][1]+"\t"+A[0][2]);
	System.out.println(A[1][0]+"\t"+A[1][1]+"\t"+A[1][2]);
	System.out.println(A[2][0]+"\t"+A[2][1]+"\t"+A[2][2]);
}
}