import student.*;
import java.util.*;

public class StudentPer {
    public static double findPercentage(int totalMarks, int subjects) {
        return (double) totalMarks / subjects;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        StudentInfo[] students = new StudentInfo[n];
        
        for (int i = 0; i < n; i++) {
            students[i] = new StudentInfo();
            System.out.println("Enter Roll No:");
            students[i].rollNo = sc.nextInt();
            System.out.println("Enter Name:");
            students[i].name = sc.next();
            System.out.println("Enter Class:");
            students[i].className = sc.next();

            int totalMarks = 0;
            System.out.println("Enter marks for 6 subjects:");
            for (int j = 0; j < 6; j++) {
                totalMarks += sc.nextInt();
            }
            students[i].percentage = findPercentage(totalMarks, 6);
        }

        System.out.println("Student Details");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }
    }
}
