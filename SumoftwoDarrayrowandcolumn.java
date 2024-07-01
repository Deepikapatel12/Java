import java.util.Scanner;
class SumoftwoDarrayrowandcolumn{
	public static void main(String args[]){
	int a[][]=new int[3][3];
	//int b[][]=new int[3][3];
	//int d[][]=new int[3][3];
	Scanner kb=new Scanner(System.in);
	int r,c;
	
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		System.out.println("Enter Elements Index A "+r+c+" : ");
		a[r][c]=kb.nextInt();
		}
	}//input
	System.out.println("Array Elements Are :");
	for(r=0;r<3;r++){
		//System.out.print("\t"+a[r][r]+a[r][r]);
	for(c=0;c<3;c++){
	System.out.print("\t"+a[c]+a[c]);
	}
System.out.print("\t"+a[r][r]+a[r][r]);
	System.out.println("");
	}//output
	System.out.println(a[r][c]);
	
	}
}