
package Marks;
import java.util.*;

public class TYMarks {
    public int th, prac;

    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Theory out of 500:");
        th = sc.nextInt();
        System.out.println("Enter marks of Practicals out of 500:");
        prac = sc.nextInt();
    }
}

