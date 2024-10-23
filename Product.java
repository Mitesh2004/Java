import java.util.Scanner;

public class Product implements Cloneable {
    int pid;
    String pname;
    double cost;

    Product() {
        this(101, "Pen", 20);
    }

    Product(int pid, String pname, double cost) {
        this.pid = pid;
        this.pname = pname;
        this.cost = cost;
    }

    void display() {
        System.out.printf("Product ID: %d\nProduct Name: %s\nProduct Cost: %.2f\n", pid, pname, cost);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Product defaultProduct = new Product();
        System.out.println("********* Default Constructor Information *********");
        defaultProduct.display();

        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Product Name: ");
        String pname = sc.next();
        System.out.print("Enter Product Cost: ");
        double cost = sc.nextDouble();

        Product paramProduct = new Product(pid, pname, cost);
        System.out.println("********* Parameterized Constructor Information *********");
        paramProduct.display();

        System.out.println("********* Object Clone Information *********");
        Product clonedProduct = (Product) paramProduct.clone();
        clonedProduct.display();
    }
}
