public class FirstTenPrimes {
    public static void main(String[] args) {
        int count = 0; 
        int number = 2; 
        while (count < 50) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1){
	 return false;
	}
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
