import java.util.*;
public class contact {

	    public static void main(String[] args) {
	        // Create a new Hashtable
	        Hashtable<String, String> contacts = new Hashtable<>();
	        Scanner sc = new Scanner(System.in);

	        // Input the number of contacts
	        System.out.print("Enter the number of contacts: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // Consume newline character

	        // Add contacts to the Hashtable
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter the mobile number for contact " + (i + 1) + ": ");
	            String mobileNumber = sc.nextLine();
	            System.out.print("Enter the name of the student: ");
	            String name = sc.nextLine();
	            contacts.put(mobileNumber, name);
	        }
	        

	        System.out.println("\nContact List:");
	        for (String key : contacts.keySet()) {
	            System.out.println("Mobile Number: " + key + ", Name: " + contacts.get(key));
	        }
	        
	        // Display the contact list
	        System.out.println("\nContact List:");
	        for (Map.Entry<String, String> entry : contacts.entrySet()) {
	            System.out.println("Mobile Number: " + entry.getKey() + ", Name: " + entry.getValue());
	        }

	        sc.close();
	    }
	}

