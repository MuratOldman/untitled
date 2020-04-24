package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dateAndTime {
    public static void main(String[] args) {

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime dt1=LocalDateTime.of(2020,04,28,11,24);
        System.out.println(dt1);

        LocalTime time= LocalTime.of(12,34);
        LocalDate date=LocalDate.of(2020,2,4);
        LocalDateTime dt2=LocalDateTime.of(date,time);
        System.out.println(dt2);

    }
}
