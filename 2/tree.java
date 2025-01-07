import java.util.*;
public class tree {
	
	    public static void main(String[] args) {
	        // Create a TreeSet to store integers (sorted and no duplicates)
	        TreeSet<Integer> numbers = new TreeSet<>();
	        Scanner sc = new Scanner(System.in);

	        // Accept the number of integers
	        System.out.print("Enter the number of integers: ");
	        int n = sc.nextInt();

	        // Accept integers from the user
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Number " + (i + 1) + ": ");
	            int number = sc.nextInt();
	            numbers.add(number); // TreeSet automatically handles duplicates and sorting
	        }

	        // Display the integers in sorted order
	        System.out.println("\nIntegers in sorted order (duplicates removed):");
	        for (int number : numbers) {
	            System.out.println(number);
	        }

	        sc.close();
	    }
	
}
