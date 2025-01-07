import java.util.*;
public class friend {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        LinkedList<String> F = new LinkedList<>();

	        // Accept the number of friends
	        System.out.print("Enter the number of friends: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // Consume the newline character

	        // Read names of friends and add them to the LinkedList
	        System.out.println("Enter the names of your friends:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Friend " + (i + 1) + ": ");
	            String name = sc.nextLine();
	            F.add(name);
	        }

	        // Display the contents of the LinkedList
	        System.out.println("\nFriends in the LinkedList:");
	        for (String friend : F) {
	            System.out.println(friend);
	        }

	        sc.close();
	    }
	
}
