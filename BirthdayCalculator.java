/*
 CIS 2348
 Jeff Schott PS 1581284
 Dr. Peggy Lindner
 Wed. 1-4pm
*/

import java.util.Scanner;

public class BirthdayCalculator {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int Day;            // variable for current day
        int BDay;           // variable for birthday
        int Month;          // variable for current month
        int BMonth;         // variable for birth month
        int Year;           // variable for current year
        int BYear;          // variable for birth year
        int age;            // variable for user age

        System.out.println("Current Date: ");
        //get the current month
        System.out.println("What month is it? ");
        Month = number.nextInt();
        //get the current day
        System.out.println("What day is it? ");
        Day = number.nextInt();
        //get the current year
        System.out.println("What year is it? ");
        Year = number.nextInt();

        System.out.println();

        System.out.println("Please enter your birthday: ");
        System.out.println("What month were you born? ");
        BMonth = number.nextInt();
        System.out.println("What day were you born? " );
        BDay = number.nextInt();
        System.out.println("What year were you born? ");
        BYear = number.nextInt();

        age = Year - BYear;

        if ( BMonth >  Month ) {
            age = age -1;
            System.out.println("***Birthday Calculator***");
            System.out.println("Current date:");
            System.out.println("Month:  " +Month);
            System.out.println("Day:    " +Day);
            System.out.println("Year:   " +Year);

            System.out.println();
            System.out.println("Birthday:");
            System.out.println("Month: " +BMonth);
            System.out.println("Day:   " +BDay);
            System.out.println("Year:  " +BYear);
            System.out.println("You are " +age+ " years young!");
        }
        else if ( BMonth==Month && BDay==Day ) {

            System.out.println("***Birthday Calculator***");
            System.out.println("Current date:");
            System.out.println("Month: " +Month);
            System.out.println("Day:   " +Day);
            System.out.println("Year:  " +Year);

            System.out.println();

            System.out.println("Birthday:");
            System.out.println("Month: " +BMonth);
            System.out.println("Day:   " +BDay);
            System.out.println("Year:  " +BYear);
            System.out.println("Happy birthday!!");
            System.out.println("You are " +age+ " years young!");
        }
        else if ( BMonth == Month && BDay > Day ) {
            age = age-1;
            System.out.println("***Birthday Calculator***");
            System.out.println("Current date:");
            System.out.println("Month: " +Month);
            System.out.println("Day:   " +Day);
            System.out.println("Year:  " +Year);

            System.out.println();

            System.out.println("Birthday:");
            System.out.println("Month: " +BMonth);
            System.out.println("Day:   " +BDay);
            System.out.println("Year:  " +BYear);
            System.out.println("You are " +age+ " years young!");
        }
        else {
            System.out.println("***Birthday Calculator***");
            System.out.println("Current date:");
            System.out.println("Month: " +Month);
            System.out.println("Day:   " +Day);
            System.out.println("Year:  " +Year);

            System.out.println();

            System.out.println("Birthday:");
            System.out.println("Month: " +BMonth);
            System.out.println("Day:   " +BDay);
            System.out.println("Year:  " +BYear);
            System.out.println("You are " +age+ " years young!");

        }
    }
}

