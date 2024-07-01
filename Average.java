import java.util.Scanner;

class Average{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
       
        int num1 = scanner.nextInt();
	 System.out.print("Numbers: ");
        int num2 = scanner.nextInt();
	 System.out.print("Numbers: ");
        int num3 = scanner.nextInt();
	 System.out.print("Numbers: ");
        int num4 = scanner.nextInt();
	 System.out.print("Numbers: ");
        int num5 = scanner.nextInt();
	 System.out.print("Numbers: ");
	int A=(num1+num2+num3+num4+num5)/5;
	System.out.println("Average is: "+A);
	}
}
