import java.util.Scanner;

class Year{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input no. of days: ");
        int days = scanner.nextInt();

        int years = days / 365;
        int remainder = days % 365;
        int months = remainder / 30;
         days = remainder % 30;

        System.out.printf("%d Year(s)\n%d Month(s)\n%d Day(s)\n", years, months, days);
    }
}