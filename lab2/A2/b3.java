import java.util.*;

public class b3 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        new Thread(() -> {
            while (true) {
                sharedData.generateNumber();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                sharedData.processEvenNumber();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                sharedData.processOddNumber();
            }
        }).start();
    }
}

class SharedData {
    private int number = -1;

    public synchronized void generateNumber() {
        number = new Random().nextInt(100);
        System.out.println("Generated: " + number);
        notifyAll();
    }

    public synchronized void processEvenNumber() {
        try {
            while (number == -1 || number % 2 != 0) wait();
            System.out.println("Square: " + (number * number));
            number = -1;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void processOddNumber() {
        try {
            while (number == -1 || number % 2 == 0) wait();
            System.out.println("Cube: " + (number * number * number));
            number = -1;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
