class ZeroNumberExc extends Exception {
    ZeroNumberExc(String msg) { super(msg); }
}

public class PrimeCheck {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            if (num == 0) throw new ZeroNumberExc("Number is 0");
            else if (isPrime(num)) System.out.println(num + " is prime");
            else System.out.println(num + " is not prime");
        } catch (ZeroNumberExc e) {
            System.out.println(e.getMessage());
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
