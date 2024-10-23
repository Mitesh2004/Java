
import Marks.*;
import java.util.*;

class Student {
    int rno, syTotal, tyTotal, grandTotal;
    String name, grade;
    float percentage;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number:");
        rno = sc.nextInt();
        System.out.println("Enter Name:");
        name = sc.next();
    }
}

class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        
        Student[] students = new Student[n];
        SYMarks[] syMarks = new SYMarks[n];
        TYMarks[] tyMarks = new TYMarks[n];
        
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            syMarks[i] = new SYMarks();
            tyMarks[i] = new TYMarks();
            
            students[i].getDetails();
            syMarks[i].getMarks();
            tyMarks[i].getMarks();
            
            students[i].syTotal = syMarks[i].ct + syMarks[i].mt + syMarks[i].et;
            students[i].tyTotal = tyMarks[i].th + tyMarks[i].prac;
            students[i].grandTotal = students[i].syTotal + students[i].tyTotal;
            students[i].percentage = students[i].grandTotal / 13.0f;
            
            if (students[i].percentage >= 70) {
                students[i].grade = "A";
            } else if (students[i].percentage >= 60) {
                students[i].grade = "B";
            } else if (students[i].percentage >= 50) {
                students[i].grade = "C";
            } else if (students[i].percentage >= 40) {
                students[i].grade = "Pass";
            } else {
                students[i].grade = "Fail";
            }
        }
        
        System.out.println("RollNo\tName\tSYTotal\tTYTotal\tGrandTotal\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].rno + "\t" + students[i].name + "\t" + students[i].syTotal + "\t" + students[i].tyTotal + "\t" + students[i].grandTotal + "\t" + students[i].percentage + "\t" + students[i].grade);
        }
    }
}
