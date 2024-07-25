import java.text.SimpleDateFormat;
import java.util.*;

public class B1 {
    public static void main(String[] args) {
        // Get the current date and time
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        // Format the current date and time in various formats
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd yyyy", Locale.ENGLISH);
        SimpleDateFormat sdf4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        SimpleDateFormat sdf6 = new SimpleDateFormat("HH:mm:ss");

        // Display the formatted date and time
        System.out.println("Current date is : " + sdf1.format(now));
        System.out.println("Current date is : " + sdf2.format(now));
        System.out.println("Current date is : " + sdf3.format(now));
        System.out.println("Current date and time is : " + sdf4.format(now));
        System.out.println("Current date and time is : " + sdf5.format(now));
        System.out.println("Current time is : " + sdf6.format(now));

        // Display week of year, week of month, and day of the year
        System.out.println("Current week of year is : " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Current week of month is : " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Current day of the year is : " + calendar.get(Calendar.DAY_OF_YEAR));
    }
}