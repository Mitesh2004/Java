class MyNumber {
    private int n;

    MyNumber() {
        n = 0;
    }

    MyNumber(int n) {
        this.n = n;
    }

    public void isPositive(int x) {
        if (x > 0) System.out.println(x + " is Positive");
        else System.out.println(x + " is not Positive");
    }

    public void isNegative(int x) {
        if (x < 0) System.out.println(x + " is Negative");
        else System.out.println(x + " is not Negative");
    }

    public void isEven(int x) {
        if (x % 2 == 0) System.out.println(x + " is Even");
        else System.out.println(x + " is not Even");
    }

    public void isOdd(int x) {
        if (x % 2 != 0) System.out.println(x + " is Odd");
        else System.out.println(x + " is not Odd");
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        MyNumber m = new MyNumber();
        m.isPositive(n);
        m.isNegative(n);
        m.isEven(n);
        m.isOdd(n);
    }
}