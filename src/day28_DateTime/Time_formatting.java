package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_formatting {
    public static void main(String[] args) {

        LocalTime time1=LocalTime.of(16,25,45);
        System.out.println(time1);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(time1.format(dtf));


        LocalTime time2=LocalTime.of(10,0);
        System.out.println(time2);
        System.out.println(time2.format(dtf));


        boolean b1=time1.isAfter(time2);
        boolean b2=time1.isBefore(time2);
        System.out.println(b1 +" "+b2);


    }
}
