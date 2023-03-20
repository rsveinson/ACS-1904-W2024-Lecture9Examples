import java.util.Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class FactorialStaticMethod{
    public static void main(String[] args){
        
        int n = 0;          // number to calculate factorial
        int factorial = 0;  // factorial of n
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number to get its factorial.");
        n = scanner.nextInt();
        
        factorial = factorial(n);
        System.out.println(n + "! = " + factorial);


        System.out.println("end of program");
    }
    
    public static int factorial(int n){
        if(n == 0){
            // the base case
            return 1;
        }// end base case
        else{
            // the recursive case
            return n * factorial(n - 1);
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
