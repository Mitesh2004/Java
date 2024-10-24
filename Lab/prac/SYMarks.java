
package Marks;
import java.util.*;

public class SYMarks {
    public int ct, mt, et;

    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Computer out of 100:");
        ct = sc.nextInt();
        System.out.println("Enter marks of Maths out of 100:");
        mt = sc.nextInt();
        System.out.println("Enter marks of Electronics out of 100:");
        et = sc.nextInt();
    }
}

