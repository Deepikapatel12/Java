import java.util.Scanner;
class SumoftwoDarray{
	public static void main(String args[]){
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int d[][]=new int[3][3];
	Scanner kb=new Scanner(System.in);
	int r,c;
	
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		System.out.println("Enter Elements Index A "+r+c+" : ");
		a[r][c]=kb.nextInt();
		}
	}//input

	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		System.out.println("Enter Elements Index B "+r+c+" : ");
		b[r][c]=kb.nextInt();
		}
	}//input
	//addition
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		d[r][c]=a[r][c]+b[r][c];
		}
	}
	
System.out.println("Array Elements Are :");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		System.out.print("\t"+a[r][c]);
	}
	System.out.println("");
	}//output

	System.out.println("Array Elements Are :");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		System.out.print("\t"+b[r][c]);
	}
	System.out.println("");
	}//output


System.out.println("Array Elements Are  D:");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
		System.out.print("\t"+d[r][c]);
	}
	System.out.println("");
	}//output


	
	}
}