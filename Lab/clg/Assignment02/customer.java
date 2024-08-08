
//import java.io.*;
import java.util.*;

class customer {
    int cid, n, i;
    String name, cno, address;

    static void search(String cno, customer a[]) {
        int i, flag = 0;
        for (i = 0; i < a.length; i++) {
            if (cno.equals(a[i].cno)) {
                a[i].display();
                flag = 1;
            }
        }
        if (flag == 0)
            System.out.println("Record not found");
    }

    void display() {
        System.out.println( "cid = " + cid +
                            "\n Name is = " + name + 
                            "\n Adress is =" + address + 
                            "\n Contact number is =" + cno);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many customer you want");
        int n = sc.nextInt();
        customer c[] = new customer[n];
        for (int i = 0; i < n; i++) {
            c[i] = new customer();
            System.out.println("Enter the cid");
            c[i].cid = sc.nextInt();
            System.out.println("Enter the name");
            c[i].name = sc.next();
            System.out.println("Enter the address");
            c[i].address = sc.next();
            System.out.println("Enter the contact number");
            c[i].cno = sc.next();
        }
        System.out.println("********* Customer Information**************");
        for (int i = 0; i < n; i++) {
            c[i].display();
        }
        System.out.println("Enter the number which you want to serach");
        String number = sc.next();
        search(number, c);

        sc.close();
    }
}
