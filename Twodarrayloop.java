import java.util.Scanner;
class Twodarrayloop{
	public static void main(String args[]){
	int a[][]=new int[3][3];
	Scanner kb=new Scanner(System.in);
	int r,c;
	
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		System.out.println("Enter Elements Index "+r+c+" : ");
		a[r][c]=kb.nextInt();
		}
	}//input

	System.out.println("Array Elements Are :");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		System.out.print("\t"+a[r][c]);
	}
	System.out.println("");
	}//output
	}
}