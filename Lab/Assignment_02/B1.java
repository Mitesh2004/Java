import java.util.*;
import B1SYMarks.*;
import B1TYMarks.*;

public class B1 {
    int rno;
    String name;
    B1SYMarks sy;
    B1TYMarks ty;

    // Constructor for B1
    B1(int rno, String name, B1SYMarks sy, B1TYMarks ty) {
        this.rno = rno;
        this.name = name;
        this.sy = sy;
        this.ty = ty;
    }

    // Method to calculate the grade
    public char calculateGrade() {
        int total = sy.computerTotal + ty.theory + ty.practicals;
        int average = total / 3;

        if (average >= 70) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else if (average >= 40) {
            return 'P';
        } else {
            return 'F';
        }
    }

    public void display() {
        System.out.println("Roll Number: " + rno);
        System.out.println("Name: " + name);
        System.out.println("SY Computer Total: " + sy.computerTotal);
        System.out.println("TY Computer Theory: " + ty.theory);
        System.out.println("TY Computer Practicals: " + ty.practicals);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        B1[] students = new B1[n]; // Correctly declare array

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("SY Computer Total: ");
            int syComputerTotal = sc.nextInt();
            System.out.print("SY Maths Total: ");
            int syMathsTotal = sc.nextInt();
            System.out.print("SY Electronics Total: ");
            int syElectronicsTotal = sc.nextInt();

            System.out.print("TY Computer Theory: ");
            int tyTheory = sc.nextInt();
            System.out.print("TY Computer Practicals: ");
            int tyPracticals = sc.nextInt();

            B1SYMarks syMarks = new B1SYMarks(syComputerTotal, syMathsTotal, syElectronicsTotal);
            B1TYMarks tyMarks = new B1TYMarks(tyTheory, tyPracticals);

            students[i] = new B1(rollNumber, name, syMarks, tyMarks); 
        }

        System.out.println("\nStudent Results:");
        for (B1 student : students) {
            student.display();
        }

        sc.close();
    }
}