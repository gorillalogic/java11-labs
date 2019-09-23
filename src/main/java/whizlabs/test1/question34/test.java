package whizlabs.test1.question34;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class test {


    public static void main(String[] args) {
        LocalTime now = LocalTime.of(10, 10, 10);
        LocalTime start = LocalTime.of(8, 30).withMinute(now.getMinute());
        LocalTime end = LocalTime.of(12, 30).withMinute(now.getMinute());
        long timePassed = now.until(start, ChronoUnit.HOURS);
        long timeToGo = now.until(end, ChronoUnit.HOURS); System.out.println(timePassed +" "+timeToGo);

    }
}
