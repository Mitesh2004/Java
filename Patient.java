import java.util.Scanner;

class CovidException extends Exception {
    CovidException() {
        super("Patient is Covid Positive, need to be hospitalized.");
    }
}

class Patient {
    String name;
    int age, olevel, hrct;

    Patient(String name, int age, int olevel, int hrct) {
        this.name = name;
        this.age = age;
        this.olevel = olevel;
        this.hrct = hrct;
    }

    void display() {
        System.out.println("Patient name: " + name + "\nAge: " + age + "\nOxygen level: " + olevel + "\nHRCT: " + hrct);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient name, age, Oxygen level, HRCT scan report:");
        Patient p = new Patient(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        try {
            if (p.olevel < 95 && p.hrct > 10) throw new CovidException();
            p.display();
        } catch (CovidException e) {
            System.out.println(e.getMessage());
        }
    }
}
