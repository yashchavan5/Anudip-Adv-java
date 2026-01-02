/* 
import java.time.*;

public class DateExample {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);                    // Full date
        System.out.println(today.getDayOfMonth());    // Day
        System.out.println(today.getYear());          // Year
        System.out.println(today.getMonth());         // Month
        System.out.println(today.getDayOfWeek());     // Day name
        System.out.println(today.minusDays(1));  // Yesterday

        LocalTime time = Localtime.now();
        System.out.println(time.get(field));
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getHour());
        System.out.println(time.getSecond());
        System.out.println(time.plusHours(hoursToAdd)());
        System.out.println(time.minusMinutes(minutesToSubtract)());


    }
}

*/


/* 
import java.time.*;

public class demo {
    public static void main(String[] args) {

        // LocalDateTime
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getDayOfWeek());

        System.out.println("-------------");

        // ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.now();

        System.out.println(zdt);
        System.out.println(zdt.getMonth());
        System.out.println(zdt.getMinute());
        System.out.println(zdt.getMonthValue());
        System.out.println(zdt.getNano());
    }
}
*/
/* 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {

        File f = new File("data.txt");

        boolean created = f.createNewFile();
        System.out.println(created);

        System.err.println(f.exists());

        FileWriter fw = new FileWriter(f);
        char [] ch = {'a','b','c','d'};
        fw.write(ch);
        fw.flush();

        FileReader fr =new FileReader(f);
        char ch[] =new char [(int)f.length()];
        fr.read (ch);
        for(int i )i=0;

    }
}

*/

class Demo {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello");
        r.run();
    }
}


/* 
@Functionalinterace 

public interface My {
    void m1 ();
    
}
    */


