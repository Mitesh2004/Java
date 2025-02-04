import java.io.*;

public class b2 {
	public static void main(String[] args) {
		File[] files = new File(".").listFiles((dir, name) -> name.endsWith(".txt"));
		if (files == null || files.length == 0) {
			System.out.println("No text files found in the current directory.");
			return;
		}

		System.out.print("Enter the string to search: ");
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			String searchString = input.readLine();

			for (File file : files) {
				new Thread(() -> searchInFile(file, searchString)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void searchInFile(File file, String searchString) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			int lineNumber = 0;
			while ((line = br.readLine()) != null) {
				lineNumber++;
				if (line.contains(searchString)) {
					System.out.println("Found in " + file.getName() + " at line " + lineNumber + ": " + line.trim());
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + file.getName());
		}
	}
}
