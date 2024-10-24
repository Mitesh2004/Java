
import java.util.*;

interface markerint {}

public class Product implements markerint {
    int pid;
    String pname;
    double cost;
    static int cnt = 0;

    Product() {
        this(101, "Pen", 20);
        cnt++;
    }

    Product(int pid, String pname, double cost) {
        this.pid = pid;
        this.pname = pname;
        this.cost = cost;
        cnt++;
    }

    void display() {
        System.out.println("Product ID: " + pid + "\nProduct Name: " + pname + "\nProduct Cost: " + cost + "\nObject Count: " + cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product df = new Product();
        df.display();

        System.out.println("How many products do you want to create?");
        int n = sc.nextInt();
        Product[] p = new Product[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter PID PName PCost");
            p[i] = new Product(sc.nextInt(),sc.next(),sc.nextDouble());
        }
        
        System.out.println("Product Details");
        for (int i = 0; i < n; i++) {
            p[i].display();
        }
    }
}



/*
import java.util.Scanner;

public class Product implements Cloneable {
    int pid;
    String pname;
    double cost;
    static int cnt = 0;

    Product() {
        this(101, "Pen", 20);
    }

    Product(int pid, String pname, double cost) {
        this.pid = pid;
        this.pname = pname;
        this.cost = cost;
	cnt++;
    }

    void display() {
	    System.out.println("COUNT:"+cnt);
        System.out.println("Product ID:"+pid+"\nProduct Name:"+pname+"\nProduct Cost:"+cost);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Product df = new Product();
        System.out.println("********* Default Constructor Information *********");
        df.display();

        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Product Name: ");
        String pname = sc.next();
        System.out.print("Enter Product Cost: ");
        double cost = sc.nextDouble();
        Product pp = new Product(pid, pname, cost);

	System.out.print("Enter PID PName PCost");
        Product pp = new Product(sc.nextInt(),sc.next(),sc.nextDouble());
        System.out.println("********* Parameterized Constructor Information *********");
        pp.display();

        System.out.println("********* Object Clone Information *********");
        Product cp = (Product) pp.clone();
        cp.display();
    }
}
*/
