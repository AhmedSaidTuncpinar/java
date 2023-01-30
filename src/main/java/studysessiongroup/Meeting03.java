package studysessiongroup;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meeting03 {

    public static void main(String[] args) {

        //Find the difference in hours for two different dates

        LocalDate y = LocalDate.of(1998,5,12);
        LocalDate g = LocalDate.of(2007,6,13);
        long dif = ChronoUnit.YEARS.between(y,g);
        System.out.println(dif);

    }
}
