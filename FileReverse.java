import java.io.*;

public class FileReverse {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the file name: ");
        String filename = new BufferedReader(new InputStreamReader(System.in)).readLine();
        
        StringBuilder content = new StringBuilder();
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = file.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        String reversed = content.reverse().toString();
        System.out.println("Reversed content with case changed:\n" + changeCase(reversed));
    }

    private static String changeCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return result.toString();
    }
}
