package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.of(2015,11,14,23,45,34);
        System.out.println(dateTime);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        System.out.println(dateTime.format(dtf));

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a, EEE");
        System.out.println(dateTime.format(dtf1));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yyyy hh:mm a, EEE");
        System.out.println(dateTime.format(dtf2));


    }
}
