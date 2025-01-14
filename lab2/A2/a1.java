class TextPrinter extends Thread {
    private String text;
    private int count;

    // Constructor to initialize text and count
    public TextPrinter(String text, int count) {
        this.text = text;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(text + " (" + i + ")");
        }
    }
}

public class a1 {
    public static void main(String[] args) {
        // Creating three threads with different text and counts
        TextPrinter thread1 = new TextPrinter("COVID19", 10);
        TextPrinter thread2 = new TextPrinter("LOCKDOWN2020", 20);
        TextPrinter thread3 = new TextPrinter("VACCINATED2021", 30);

        // Starting all threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}