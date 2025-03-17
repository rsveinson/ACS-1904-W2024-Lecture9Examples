import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class RecursiveSum
{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        int[] list = {8, 6, 7, 5, 3, 0, 9, 10};

        int sum = 0;
        
        //sum = linearSum(list, list.length);
        sum = binarySum(list, 0, list.length - 1);
        System.out.println(sum);


        System.out.println("end of program");
    }
    
    public static int linearSum(int[] l, int n){
        if(n == 0)
            return 0;
        else
            //return l[n-1] + linearSum(l, n-1);
            return linearSum(l, n-1) + l[n-1];
    }
    
    public static int binarySum(int[] l, int low, int high){
        if(low > high)
            return 0;
        else if (low == high)  // low == high means only one number in the list
            return l[low];
        else{
            /* split the list in half and return the
             * sum of the left half and the right half
             */
            int mid = (low + high) / 2;
            return binarySum(l, low, mid) + binarySum(l, mid + 1, high);
        }
        
        
    }// end binary sum
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
