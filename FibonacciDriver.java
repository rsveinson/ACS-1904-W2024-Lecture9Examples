
/** 
 * ACS-1904 Fibonacci Driver for the fibonacci recursive example
 * @Sveinson 
*/

public class FibonacciDriver{
    public static void main(String[] args){
        Fibonacci fib = new Fibonacci();
        int n = 10;     // the fibonacci number to find
        int fibN = 0;   // this is the nth fibonacci number
        
        /* find the nth fibonacci number using
         * a recursive method
         */
        // for(int i = 0; i < n; i++){
            // fibN = fib.fibonacci(i);
            // System.out.println("The " + (i + 1) + "th Fibonacci number is: " + fibN);
        // }
        
        // let's see how this works for a single
        // fibonacci computation
        System.out.println(fib.fibonacci(3));

        System.out.println("end of program");
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
