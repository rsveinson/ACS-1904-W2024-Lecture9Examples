public class Factorial {
    public int factorial (int n){
        if (n==0) 
            return 1;// base case is solved
        return n*factorial(n-1);// smaller problem
    }
}
