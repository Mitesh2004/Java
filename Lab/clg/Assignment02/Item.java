//import java.io.*;
//import java.util.*;

class Item {
    int ino;
    String name, dname;
    float price;
    static int cnt = 0;

    Item() {
        cnt++;
    }

    Item(int ino, String name, String dname, float price) {
        this.ino = ino;
        this.dname = dname;
        this.name = name;
        this.price = price;
        cnt++;
    }

    void display() {
        System.out.println("Id is = " + this.ino +
                "\nItem name = " + this.name +
                "\nDepartment name = " + this.dname +
                "\nPrice = " + this.price +
                "\nNumber of objects created = " + cnt);
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.display();
        Item i1 = new Item(123, "pen", "stationary", 100);
        i1.display();
    }
}
