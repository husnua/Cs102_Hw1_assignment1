package Cs102_Hw1_assignment1;

public class ArrayOperations {
    public static int findMin( int[] a ){
        int mn = a[ 0 ]; 
        for( int i = 1; i < a.length; i++){
            if( mn > a[ i ] ){
                mn = a[ i ];
            }
        }
        return mn;
    }
    public static int findMax( int[] a ){
        int mx = a[ 0 ]; 
        for( int i = 1; i < a.length; i++){
            if( mx < a[ i ] ){
                mx = a[ i ];
            }
        }
        return mx;
    }
    public static int sumOfOdds( int[] a ){
        int sum = 0;
        for ( int i = 1; i < a.length; i+=2){
            sum += a[ i ];
        }
        return sum;
    }
    public static int sumOfEvens( int[] a ){
        int sum = 0;
        for ( int i = 0; i < a.length; i+=2){
            sum += a[ i ];
        }
        return sum;
    }
    public static int findAverage( int [] givenArray)
    {
        int sum = 0;
        for ( int i : givenArray)
        {
            sum += i;
        }
        return sum / ( givenArray.length);
    }
    public static int [] differences( int [] givenArray)
    {
        int avg = findAverage( givenArray);
        int [] differenceArray = new int [givenArray.length];
        for ( int i = 0; i < givenArray.length; i++)
        {
            differenceArray[i] = givenArray[i] - avg;
        }
        return differenceArray;

    }
}
