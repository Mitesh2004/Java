//import java.io.*;
public class demo_6 {
    public static void main(String[] args) {
        int a = 90, b = 60;
        System.out.println("if_else if");
        System.out.println("Value of a is:" + a);
        System.out.println("Value of a is:" + b);
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (a < b) {
            System.out.println(a + " is smaller than " + b);
        } else {
            System.out.println(a + "and" + b + "are equal");
        }
    }
}