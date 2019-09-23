package time.LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExamples {

    public static void basicExamples() {
        LocalTime today = LocalTime.now();
        System.out.println("today:" + today);

        LocalTime tomorrow = today.plusHours(24);
        System.out.println("tomorrow:" + tomorrow);

        LocalTime yesterday = tomorrow.minusHours(24);
        System.out.println("yesterday:" + yesterday);

    }

    public static void isNotimmutable() {
        LocalTime today = LocalTime.now();
        System.out.println("today:" + today);


        today = today.withHour(1);
        System.out.println("today withHour(1):" + today);

        today = today.minusHours(1);
        System.out.println("today minusHours(1):" + today);
    }


}