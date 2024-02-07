package Cs102_Hw1_assignment1;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
import java.util.Arrays;


/**
 * test
 */
public class test {
    
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        Random r1 = new Random();
        System.out.print( "Enter array size: ");
        int givenSize = in.nextInt();

        int [] arr = new int[givenSize];
        for( int i = 0; i < givenSize; i++)
        {
            arr[i] = r1.nextInt(100);
        }

        int choice;
        System.out.println("Your array: " + Arrays.toString(arr));
       do {
        System.out.println("-----Menu-----");
        System.out.println("1-) Find the maximum");
        System.out.println("2-) Find the minimum");
        System.out.println("3-) Find the average");
        System.out.println("4-) Find the differences from the average");
        System.out.println("5-) Find the sum of the odd indexes");
        System.out.println("6-) Find the sum of the even indexes");
        System.out.println("7-) Exit");
        System.out.println("Please select an option from the menu: ");
        choice = in.nextInt();

        // Finding the Maximum
        if(choice==1) {
            System.out.println(ArrayOperations.findMax(arr)); 
        }

        // Finding the Minimum
        else if (choice == 2) {
            System.out.println(ArrayOperations.findMin(arr));
        }

        // Finding the Average
        else if (choice==3) {
            System.out.println(ArrayOperations.findAverage(arr));
        }

        // Finding the Differences from the Average
        else if (choice==4) {
            System.out.println(Arrays.toString(ArrayOperations.differences(arr)));
        }

        else if (choice == 5) {
            System.out.println(ArrayOperations.sumOfOdds(arr));
        }

        else if (choice == 6) {
            System.out.println(ArrayOperations.sumOfEvens(arr));
        }
        
        else if (choice == 7) {
            System.out.println("Exiting the menu.");
        }
        
       } while (choice != 7);




       in.close();
        
    }
}