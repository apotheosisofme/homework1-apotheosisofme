/*
 CIS 2348
 Jeff Schott PS 1581284
 Dr. Peggy Lindner
 Wed. 1-4pm
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BirthdayCalculator_GUI_Version {

    public static void main(String[] args) {



        Scanner number = new Scanner(System.in);

        int Day;            // variable for current day
        int BDay;           // variable for birthday
        int Month;          // variable for current month
        int BMonth;         // variable for birth month
        int Year;           // variable for current year
        int BYear;          // variable for birth year
        int age;            // variable for user age

        JOptionPane.showMessageDialog(null, "Current Date: ");

        //get the current month
        Month = Integer.parseInt(JOptionPane.showInputDialog("What month is it? Enter 1-12"));

        //get the current day
        Day = Integer.parseInt(JOptionPane.showInputDialog("What day is it? Enter 1-31"));

        //get the current year
        Year = Integer.parseInt(JOptionPane.showInputDialog("What year is it? "));

        JOptionPane.showMessageDialog(null,"Please enter your birthday: ");

        //get month you were born
        BMonth = Integer.parseInt(JOptionPane.showInputDialog("What month were you born? "));

        //get the day you were born
        BDay = Integer.parseInt(JOptionPane.showInputDialog("What day were you born? "));

        //get the year you were born
        BYear = Integer.parseInt(JOptionPane.showInputDialog("What year were you born? "));

        age = Year - BYear;

        if ( BMonth >  Month ) {
            age = age -1;
            JOptionPane.showMessageDialog(null,"***Birthday Calculator***");
            JOptionPane.showMessageDialog(null,"Current date:");
            JOptionPane.showMessageDialog(null, Month + "/" + Day + "/" + Year);

            JOptionPane.showMessageDialog(null, "Birthday:");
            JOptionPane.showMessageDialog(null, BMonth + "/" + BDay + "/" + BYear);

            JOptionPane.showMessageDialog(null, "You are " +age+ " years young!");
        }
        else if ( BMonth==Month && BDay==Day ) {

            JOptionPane.showMessageDialog(null,"***Birthday Calculator***");
            JOptionPane.showMessageDialog(null,"Current date:");
            JOptionPane.showMessageDialog(null, Month + "/" + Day + "/" + Year);

            JOptionPane.showMessageDialog(null,"Birthday:");
            JOptionPane.showMessageDialog(null, BMonth + "/" + BDay + "/" + BYear);

            JOptionPane.showMessageDialog(null,"Happy birthday!!");
            JOptionPane.showMessageDialog(null,"You are " +age+ " years young!");
        }
        else if ( BMonth == Month && BDay > Day ) {
            age = age-1;
            JOptionPane.showMessageDialog(null,"***Birthday Calculator***");
            JOptionPane.showMessageDialog(null,"Current date:");
            JOptionPane.showMessageDialog(null, Month + "/" + Day + "/" + Year);

            JOptionPane.showMessageDialog(null,"Birthday:");
            JOptionPane.showMessageDialog(null, BMonth + "/" + BDay + "/" + BYear);
            JOptionPane.showMessageDialog(null,"You are " +age+ " years young!");
        }
        else {
            JOptionPane.showMessageDialog(null,"***Birthday Calculator***");
            JOptionPane.showMessageDialog(null,"Current date:");
            JOptionPane.showMessageDialog(null, Month + "/" + Day + "/" + Year);

            JOptionPane.showMessageDialog(null,"Birthday:");
            JOptionPane.showMessageDialog(null, BMonth + "/" + BDay + "/" + BYear);;
            JOptionPane.showMessageDialog(null,"You are " +age+ " years young!");

        }
    }
}

