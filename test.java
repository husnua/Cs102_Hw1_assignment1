package Cs102_Hw1_assignment1;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

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

        
    }

    

}