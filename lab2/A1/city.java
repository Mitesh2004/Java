import java.util.*;

public class city {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<String> City = new ArrayList<>();

	        // Accept the number of cities
	        System.out.print("Enter the number of cities: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // Consume the newline character

	        // Accept city names and add them to the ArrayList
	        System.out.println("Enter the names of the cities:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("City " + (i + 1) + ": ");
	            String city = sc.nextLine();
	            City.add(city);
	        }

	        // Display the contents of the ArrayList
	        System.out.println("\nCities in the ArrayList:");
	        for (String city : City) {
	            System.out.println(city);
	        }

	        // Remove all elements from the ArrayList
	        City.clear();
	        System.out.println("\nAll cities have been removed. ArrayList size: " + City.size());

	        sc.close();
	    }
	}

