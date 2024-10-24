class College {
    int cno; String cname, caddr;
    College(int cno, String cname, String caddr) { this.cno = cno; this.cname = cname; this.caddr = caddr; }
    void display() { System.out.println(cno + " " + cname + " " + caddr); }
}

class Department extends College {
    int dno; String dname;
    Department(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr); this.dno = dno; this.dname = dname;
    }
    void display() {
        super.display();
        System.out.println(dno + " " + dname);
    }
}

public class Main {
    public static void main(String[] args) {
        Department d = new Department(1, "XYZ College", "City", 101, "CSE");
        d.display();
    }
}
