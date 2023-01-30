package studysessiongroup;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q03 {

    public static void main(String[] args) {

        //Type the code that finds out how many days Ali lived. Date of birth of Ali is 12th of May 2002

        LocalDate dAli= LocalDate.of(2002,05,12);
        System.out.println(dAli);

       LocalDate cno= LocalDate.now();

       long daysAli= ChronoUnit.DAYS.between(dAli,cno);
        System.out.println(daysAli);//7447

    }
}
