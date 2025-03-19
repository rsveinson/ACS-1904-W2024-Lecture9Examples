import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
 *              a recursive method to find the sum of the first n
 *              multiples of m
*/

public class SumOfNMultiplesOfM{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);

        int n = 5;      // how many mulitple
        int m = 3;      // multiples of...
        
        System.out.println(sumOfNOfM(n, m));


        System.out.println("end of program");
    }// end main
    
    public static int sumOfNOfM(int n, int m){
        
        if(n == 0){
            return 0;
        }//end base case
        else{
            return (n * m) + sumOfNOfM(n -1, m);
        }
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
