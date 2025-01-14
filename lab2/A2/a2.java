import java.util.*;

class rc extends Thread {
    private int start;
    private int end;

    // Constructor to initialize start and end values
    public rc(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i >= end; i--) {
            // Change the thread name every 3 counts (or any interval you prefer)
            if (i == start - 3) {
                this.setName("CountingDown");
            }

            System.out.println("Thread [" + this.getName() + "] Count: " + i);

            try {
                Thread.sleep(6000); // Sleep for 6 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class a2 {
    public static void main(String[] args) {
        // User input for start and end numbers
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();
*/
        rc counterThread = new rc(10, 1);
        counterThread.setName("CountingStart"); // Initial thread name
        counterThread.start();

       // scanner.close();
    }
}