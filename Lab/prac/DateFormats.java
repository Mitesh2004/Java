import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormats {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat format4 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");

        System.out.println("Current date is: " + format1.format(now));
        System.out.println("Current date is: " + format2.format(now));
        System.out.println("Current date is: " + format3.format(now));
        System.out.println("Current date and time is: " + format4.format(now));
        System.out.println("Current date and time is: " + format5.format(now));
    }
}
