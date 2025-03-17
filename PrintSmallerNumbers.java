import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class PrintSmallerNumbers{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        int n = 1234567;
        System.out.println("Print " + n + " diminishing.");
        printDimishingNumber(n);


        System.out.println("end of program");
    }
    
    public static void printDimishingNumber(int n){
        if(n == 0){
            System.out.println("Zero!");
        }
        else{
            System.out.println(n);
            printDimishingNumber(n  / 10);
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
