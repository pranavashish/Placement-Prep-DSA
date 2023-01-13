public class Fibonacci_Number {

    public static int fibo(int n) {
        //base case
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int fib = fibo(n-1) + fibo(n-2);
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));

    }


}
