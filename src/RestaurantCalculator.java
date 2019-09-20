// CIS 2348
// Jeff Schott PS 1581284
// Dr. Peggy Lindner
// Wed. 1-4pm

import java.util.Scanner;

public class RestaurantCalculator {

    public static void main ( String[] args ) {

        double SubTotal = 0;        //subtotal after each item
        double finalTotal;          //total after tax and tip
        double Tax;                 //calculated tax
        double tip;                 //pro-rated tip based on total
        int numberOfItems;          //number of items purchased so as to cue input of prices

        System.out.println("Enter The Number of Items Purchased: ");
        Scanner input = new Scanner(System.in);

        numberOfItems = input.nextInt();

        for ( int i = 0; i < numberOfItems; i++ ) {

            System.out.println("Enter the price for item number " + (i + 1));

            SubTotal += Math.round((input.nextFloat())*100.0)/100.0;
            //using the math class to round the original formula to two or less decimal places
        }

        //calculates tip greater than 100 dollars
        if ( SubTotal>100 ) {

            tip = Math.round((SubTotal*(0.20))*100.0)/100.0;
        }

        //calculates tip from 50 to 100 dollars
        else if ( SubTotal>50 ) {

            tip = Math.round((SubTotal*(0.15))*100.0)/100.0;
        }

        //calculates tip from 25 to 50 dollars
        else if ( SubTotal>25 ) {

            tip = Math.round((SubTotal*(0.05))*100.0)/100.0;
        }

        //uses a zero tip for anything less than 25 dollars. Cheapskates!
        else {

            tip = 0;
        }

        Tax = Math.round((SubTotal*(0.0825))*100.0)/100.0;

        finalTotal = Math.round((SubTotal + Tax + tip)*100.0)/100.0;


        System.out.println("********************* ");
        System.out.println("Customer Itemization: " );
        System.out.println("********************* ");
        System.out.println();
        System.out.println("Subtotal:       " + SubTotal );
        System.out.println("Sales Tax:      " + Tax );
        System.out.println("Tip:            " + tip );
        System.out.println("Final Total:    " + finalTotal );

    }


}
