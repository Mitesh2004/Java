import java.util.*;
public class hsort {
	
	    public static void main(String[] args) {
	        // Create a HashMap to store data
	        HashMap<Integer, String> map = new HashMap<>();
	        Scanner sc = new Scanner(System.in);

	        // Accept the number of entries
	        System.out.print("Enter the number of entries: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // Consume newline character

	        // Add entries to the HashMap
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter key (integer) for entry " + (i + 1) + ": ");
	            int key = sc.nextInt();
	            sc.nextLine(); // Consume newline
	            System.out.print("Enter value (string) for entry " + (i + 1) + ": ");
	            String value = sc.nextLine();
	            map.put(key, value);
	        }

	        // Display the HashMap before sorting
	        System.out.println("\nHashMap before sorting:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // Sort the HashMap by keys
	        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

	        // Display the HashMap after sorting
	        System.out.println("\nHashMap after sorting by keys:");
	        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        sc.close();
	    }
	}

