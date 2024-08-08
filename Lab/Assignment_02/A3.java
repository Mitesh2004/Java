import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {
        // Ensure there are exactly 5 command line arguments
        if (args.length != 5) {
            System.out.println("Please enter exactly 5 numbers as command line arguments.");
            return;
        }

        // Array to hold the 5 numbers
        int n[] = new int[5];

        // Parse command line arguments to integers and store in the array
        try {
            for (int i = 0; i < 5; i++) {
                n[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
            return;
        }

        // Sort the array of numbers
        Arrays.sort(n);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (int number : n) {
            System.out.println(number);
        }
    }
}