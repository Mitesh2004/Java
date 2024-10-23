import java.util.*;

abstract class Staff {
    protected int id;
    protected String name;
    
    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OStaff extends Staff {
    String dname;
    
    OStaff(int id, String name, String dname) {
        super(id, name);
        this.dname = dname;
    }
    
    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Department: " + dname);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of staff:");
        int n = sc.nextInt();
        OStaff[] o = new OStaff[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID, Name, Department:");
            o[i] = new OStaff(sc.nextInt(), sc.next(), sc.next());
        }
        
        System.out.println("****** Office Staff Details ******");
        for(int i=0;i<n;i++) {
            o[i].display();
        }
    }
}
