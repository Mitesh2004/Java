import java.util.*;
public class llist {
	

	    public static void main(String[] args) {
	        // Create a LinkedList to store integer objects
	        LinkedList<Integer> list = new LinkedList<>();

	        // Add elements to the linked list
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);

	        System.out.println("Original List: " + list);

	        // Add an element at the first position
	        list.addFirst(5); // Adds 5 at the first position
	        System.out.println("After adding 5 at the first position: " + list);

	        // Delete the last element
	        list.removeLast(); // Removes the last element (40)
	        System.out.println("After deleting the last element: " + list);

	        // Display the size of the linked list
	        System.out.println("Size of the linked list: " + list.size());
	    }
	}

