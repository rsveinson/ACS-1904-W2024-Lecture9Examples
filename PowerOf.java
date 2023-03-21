import java.util.Scanner;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class PowerOf{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int exponent;
        int pot = 0;

        System.out.println("enter the power of two");
        exponent = scanner.nextInt();
        
        pot = powerOfTwo(exponent);
        System.out.println("2 to the power of " + exponent + " = " + pot);
        


        System.out.println("end of program");
    }
    
    public static int powerOfTwo(int ex){
        if(ex == 0){
            return 1;
        }// end base case
        else{
            return 2 * powerOfTwo(ex -1);
        }// end recursive call


        
    }// end power of two
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
