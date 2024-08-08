
//mport java.io.*;
//import java.util.*;

class employee {
    int eid;
    String ename, designation;
    float sal;

    employee(int eid, String ename, String designation, float sal) {
        this.eid = eid;
        this.ename = ename;
        this.designation = designation;
        this.sal = sal;
    }

    public String toString() {
        return eid + " " + ename + " " + designation + " " + sal;
    }

    public static void main(String args[]) {
        employee e = new employee(1, "Ninad", "Professor", 25000);
        employee e1 = new employee(2, "Tanmay", "Doctor", 30000);
        System.out.println("Employee Information \n" + e);
        System.out.println("Employee Information \n" + e1);
    }
}
