import java.util.*;

class A2 {
    int rollNo;
    String name;
    double percentage;
    static int cnt = 0;

    // Constructor to initialize Student object
    A2(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
        cnt++;
    }

    // Static method to sort students based on percentage
    static void sort(A2 student[]) {
        Arrays.sort(student, (s1, s2) -> Double.compare(s2.percentage, s1.percentage));
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("---------------------------");
    }

    static void Count() {
        System.out.println("Number of Employee objects created: " + cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        A2[] students = new A2[n];

        // Accepting student details from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Percentage: ");
            double percentage = sc.nextDouble();

            // Create a new Student object and store it in the array
            students[i] = new A2(rollNo, name, percentage);
        }

        System.out.println("\nBefore sorted");
        for (A2 student : students) {
            student.display();
        }

        // Sort students by percentage
        A2.sort(students);

        // Display the sorted list of students
        System.out.println("\nSorted list of students by percentage:");
        for (A2 student : students) {
            student.display();
        }

        A2.Count();

        sc.close();
    }
}