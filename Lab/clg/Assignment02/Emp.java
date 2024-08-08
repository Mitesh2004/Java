import java.util.*;

class Emp {
    int eid;
    String name, dname;
    float salary;
    static int cnt = 0;

    Emp() {
        eid = 0;
        name = "Unknown";
        dname = "Unknown";
        salary = 0.0f;
        cnt++;
    }

    Emp(int eid, String name, String dname, float salary) {
        this.eid = eid;
        this.name = name;
        this.dname = dname;
        this.salary = salary;
        cnt++;
    }

    void display() {
        System.out.println("Emp id is " + eid +
                "\nEmployee name is: " + name +
                "\nEmployee department is " + dname +
                "\nEmployee salary is " + salary);
    }

    void count() {
        System.out.println("Number of objects created are " + cnt);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****** Default constructor values are **********");
        Emp e1 = new Emp();
        e1.display();

        System.out.println("How many employees do you want?");
        int n = sc.nextInt();
        Emp[] e = new Emp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the id");
            int id = sc.nextInt();
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the department name");
            String dname = sc.next();
            System.out.println("Enter the salary");
            float salary = sc.nextFloat();
            e[i] = new Emp(id, name, dname, salary);
        }

        for (Emp emp : e) {
            emp.display();
        }

        e1.count();
        sc.close(); // Close the scanner
    }
}