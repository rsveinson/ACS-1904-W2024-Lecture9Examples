public class Fibonacci
{
    public int fibonacci (int n){
        if (n==0) return 0;    // first base case
        if (n==1) return 1;    // second base case
        return fibonacci(n-1) + fibonacci(n-2); // two simpler problems
    }
}
