import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Cricket {
    String name;
    int inn, out, runs, avg;

    Cricket() {
        this("Dhoni", 80, 10, 5000);
    }

    Cricket(String name, int inn, int out, int runs) {
        this.name = name;
        this.inn = inn;
        this.out = out;
        this.runs = runs;
    }

    static void calculateAvg(Cricket[] c) {
        for (int i = 0; i < c.length; i++)
            c[i].avg = c[i].runs / c[i].inn;
    }

    static void sort(Cricket[] c) {
        Arrays.sort(c, Comparator.comparingInt(p -> p.avg));
    }

    void display() {
        System.out.println("Name: " + name + " | Innings: " + inn + " | Out: " + out + " | Runs: " + runs + " | Avg: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	Cricket df = new Cricket(); // Create a default player instance
        System.out.println("********** Default Information **********");
        df .display(); // Call display method on the default player

        System.out.println("How many players?");
        int n = sc.nextInt();
        Cricket[] p = new Cricket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name, Innings, Out, Runs:");
            p[i] = new Cricket(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()); // Fixed reference to players array
        }

        System.out.println("********** Player Information **********");
        calculateAvg(p);
        for (int i = 0; i < n; i++) {
            p[i].display(); // Fixed reference to players array
        }

        sort(p);
        System.out.println("********** Sorted by Batting Avg **********");
        for (int i = 0; i < n; i++) {
            p[i].display(); // Fixed reference to players array
        }
    }
}
