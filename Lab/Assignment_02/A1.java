import java.util.*;

class A1 {
    int id;
    String name;
    String deptName;
    double salary;
    static int cnt = 0;

    // Default constructor
    A1() {

    }

    // Parameterized constructor
    A1(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        cnt++;
    }

    static void Count() {
        System.out.println("Number of Employee objects created: " + cnt);
    }

    void display() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department Name: " + deptName);
        System.out.println("Salary: $" + salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numEmployees = sc.nextInt();

        A1[] employees = new A1[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department Name: ");
            String deptName = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new A1(id, name, deptName, salary);
        }
        for (A1 a1 : employees) {
            a1.display();
        }
        A1.Count();

        sc.close();
    }
}