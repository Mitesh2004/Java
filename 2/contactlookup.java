import java.util.*;
import java.io.*;
public class contactlookup {
	
	    public static void main(String[] args) {
	        Hashtable<String, String> contacts = new Hashtable<>();
	        Scanner sc = new Scanner(System.in);

	        // Load data from the text file
	        try (BufferedReader br = new BufferedReader(new FileReader("contacts.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] record = line.split("\t"); // Split fields by tab
	                if (record.length == 2) {
	                    String name = record[0];
	                    String phone = record[1];
	                    // Store both name-to-phone and phone-to-name mappings
	                    contacts.put(name, phone);
	                    contacts.put(phone, name);
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	            return;
	        }

	        // Display loaded data
	        System.out.println("Contacts loaded successfully!");
	        System.out.println("You can search by name or phone number.");

	        // Perform lookups
	        while (true) {
	            System.out.print("\nEnter a name or phone number to search (or type 'exit' to quit): ");
	            String input = sc.nextLine();
	            if (input.equalsIgnoreCase("exit")) {
	                break;
	            }

	            // Search the hash table
	            if (contacts.containsKey(input)) {
	                System.out.println("Result: " + contacts.get(input));
	            } else {
	                System.out.println("No match found.");
	            }
	        }

	        sc.close();
	    }
	}

