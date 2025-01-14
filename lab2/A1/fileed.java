import java.io.*;
import java.util.*;

public class fileed {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java FileEditor <filename>");
            return;
        }

        String filename = args[0];
        List<String> lines = new ArrayList<>();

        // Reading the file into the list
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert line");
            System.out.println("2. Delete line");
            System.out.println("3. Append line");
            System.out.println("4. Modify line");
            System.out.println("5. Display file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1: // Insert line
                    System.out.print("Enter line number to insert at: ");
                    int insertPos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    if (insertPos >= 1 && insertPos <= lines.size() + 1) {
                        lines.add(insertPos - 1, insertText);
                        System.out.println("Line inserted successfully.");
                    } else {
                        System.out.println("Invalid line number.");
                    }
                    break;

                case 2: // Delete line
                    System.out.print("Enter line number to delete: ");
                    int deletePos = scanner.nextInt();
                    if (deletePos >= 1 && deletePos <= lines.size()) {
                        lines.remove(deletePos - 1);
                        System.out.println("Line deleted successfully.");
                    } else {
                        System.out.println("Invalid line number.");
                    }
                    break;

                case 3: // Append line
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    lines.add(appendText);
                    System.out.println("Line appended successfully.");
                    break;

                case 4: // Modify line
                    System.out.print("Enter line number to modify: ");
                    int modifyPos = scanner.nextInt();
                    scanner.nextLine();
                    if (modifyPos >= 1 && modifyPos <= lines.size()) {
                        System.out.print("Enter new text: ");
                        String modifyText = scanner.nextLine();
                        lines.set(modifyPos - 1, modifyText);
                        System.out.println("Line modified successfully.");
                    } else {
                        System.out.println("Invalid line number.");
                    }
                    break;

                case 5: // Display file
                    System.out.println("\nCurrent File Content:");
                    for (int i = 0; i < lines.size(); i++) {
                        System.out.println((i + 1) + ": " + lines.get(i));
                    }
                    break;

                case 6: // Exit and save
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                        for (String l : lines) {
                            writer.write(l);
                            writer.newLine();
                        }
                        System.out.println("File saved successfully.");
                    } catch (IOException e) {
                        System.out.println("Error saving file: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}