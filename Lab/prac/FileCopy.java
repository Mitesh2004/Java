import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(args[0]);
        FileWriter fw = new FileWriter(args[1]);
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
        System.out.println("File copied successfully from " + args[0] + " to " + args[1]);
    }
}
