package homework6.task3;

import java.time.LocalDateTime;
import java.util.*;

public class TimeCheck {
    public static void main(String[] args) {

        TimeCheck tc = new TimeCheck();

        tc.timePassed();

    }

    public void timePassed (){
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter the day: ");
        int day = in.nextInt();
        System.out.println("Please, enter the month: ");
        int month = in.nextInt() - 1;
        System.out.println("Please, enter the year: ");
        int year = in.nextInt();


        GregorianCalendar greg = new GregorianCalendar(year, month, day);

        System.out.println("Year: " + greg.get(Calendar.YEAR));
        System.out.println("Month: " + (greg.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + greg.get(Calendar.DATE));

        LocalDateTime locTime = LocalDateTime.now();

        System.out.println("It's been: ");
        System.out.println( locTime.getYear() - greg.get(Calendar.YEAR) + " years,");
        System.out.println( locTime.getMonthValue() - greg.get(Calendar.MONTH) - 1 + " months and ");
        System.out.println( locTime.getDayOfMonth() - greg.get(Calendar.DATE) + " days since you were born");
    }
}

// my result:
//        Please, enter the day:
//        3
//        Please, enter the month:
//        1
//        Please, enter the year:
//        2007
//        Year: 2007
//        Month: 0
//        Day: 3
//        It's been:
//        14 years,
//        3 months and
//        27 days since you were born

