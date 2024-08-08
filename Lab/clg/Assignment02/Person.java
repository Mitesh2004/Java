//import java.io.*;
import java.util.*;

class Person {
    String pname, pan, adhar;

    Person(String pname, String pan, String adhar) {
        this.pname = pname;
        this.pan = pan;
        this.adhar = adhar;
    }

    void display() {
        System.out.println("Person name is " + pname +
                           "\nPerson PAN card number is " + pan +
                           "\nPerson Aadhar card number is " + adhar+"\n");
    }

    public static void main(String args[]) {
        Person[] p = new Person[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + (i + 1) + " person information");
            System.out.println("Enter the name of person");
            String pname = sc.next();
            System.out.println("Enter the PAN number of person");
            String pan = sc.next();
            System.out.println("Enter the Aadhar card number of person");
            String adhar = sc.next();
            p[i] = new Person(pname, pan, adhar);
        }
        System.out.println("********** Person Information *********");
        for (Person person : p) {
            person.display();
        }
        sc.close();
    }
}