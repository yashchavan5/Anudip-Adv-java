/*
import java.time.*;
import java.time.format.*;

class DateTimeExample {
    public static void main(String[] args) {

        // create date and time object
        LocalDateTime dt = LocalDateTime.now();

        // format date and time
        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Date and Time: " + dt.format(f));

        System.out.println("\nMonths and days (Non-Leap Year):");

        // print months and number of days
        for (Month m : Month.values()) {
            System.out.println(m + " = " + m.length(false) + " days");
        }
    }
}
*/