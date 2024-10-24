import java.io.*;
import java.util.Scanner;

public class FileCount {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            int lines = 0, words = 0;
            while (sc.hasNextLine()) {
                lines++;
                words += sc.nextLine().split(" ").length;
            }
            System.out.println("Words: " + words + ", Lines: " + lines);
        } else {
            System.out.println("File does not exist.");
        }
    }
}
