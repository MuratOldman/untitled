package day28_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BirthDays {
    public static void main(String[] args) {
        String[] friends={"ali","veli","john","johnathan","Daniel"};
        LocalDate aliBirthDay=LocalDate.of(2000,10,12);
        LocalDate veliBirthDay=LocalDate.of(1976,11,15);
        LocalDate johnBirthDay=LocalDate.of(1999,3,17);
        LocalDate johnathanBirthDay=LocalDate.of(1978,5,18);
        LocalDate DanielBirthDay=LocalDate.of(1991,12,25);
        LocalDate[]birthDays={aliBirthDay,veliBirthDay,johnBirthDay,johnathanBirthDay,DanielBirthDay};

        for(int i=0;i<friends.length;i++){
            String name=friends[i];
            LocalDate birthDay=birthDays[i];
            System.out.println(name+"'s birthday is "+birthDay);
        }

    }
}
