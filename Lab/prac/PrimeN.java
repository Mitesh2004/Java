public class PrimeN {
    public static void main(String[] args) {
        for (String num : args) {
            int n = Integer.parseInt(num);
            if (isPrime(n)) {
                System.out.println(n + " is prime");
            }
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
