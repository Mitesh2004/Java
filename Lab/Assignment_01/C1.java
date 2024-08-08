import java.util.*;

public class C1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number of countries
        System.out.print("Enter the number of countries: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Initialize a list to store the country names
        ArrayList<String> countries = new ArrayList<>();

        // Read the country names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name " + (i + 1) + ": ");
            String country = sc.nextLine();
            countries.add(country);
        }

        // Sort the list in descending order
        Collections.sort(countries, Collections.reverseOrder());

        // Display the sorted list
        System.out.println("\nCountries in descending order:");
        for (String country : countries) {
            System.out.println(country);
        }
        
        sc.close();
    }
}















