import java.util.*;
public class color {

	    public static void main(String[] args) {
	        // Create a new TreeSet
	        TreeSet<String> colors = new TreeSet<>();

	        // Add some colors to the TreeSet
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Print out the TreeSet
	        System.out.println("Colors in the TreeSet:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}

