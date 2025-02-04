import java.util.Scanner;

class Message {
    private String message;
    private boolean hasMessage = false;

    // Synchronized method for sending message
    public synchronized void sendMessage(String msg) {
        while (hasMessage) { // Wait if the previous message is not received
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = msg;
        hasMessage = true;
        notify(); // Notify receiver that message is available
    }

    // Synchronized method for receiving message
    public synchronized String receiveMessage() {
        while (!hasMessage) { // Wait until a message is available
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasMessage = false;
        notify(); // Notify sender that message is received
        return message;
    }
}

// Sender Thread
class Sender extends Thread {
    private Message msg;
    
    public Sender(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("\nEnter message: ");
            input = scanner.nextLine();
            msg.sendMessage(input);
        } while (!input.equals("Good Bye Corona"));

    }
}

// Receiver Thread
class Receiver extends Thread {
    private Message msg;

    public Receiver(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String receivedMsg;
        do {
            receivedMsg = msg.receiveMessage();
            System.out.println("\nReceived: " + receivedMsg);
        } while (!receivedMsg.equals("Good Bye Corona"));
    }
}

// Main class
public class C3{
    public static void main(String[] args) {
        Message sharedMessage = new Message();
        
        Sender sender = new Sender(sharedMessage);
        Receiver receiver = new Receiver(sharedMessage);
        
        sender.start();
        receiver.start();
    }
}
