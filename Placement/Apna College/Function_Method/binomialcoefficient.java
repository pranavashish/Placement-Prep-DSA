import java.util.Scanner;

public class binomialcoefficient {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n ; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static int binomial(int n, int r){
        int nr = n-r;
        int factn =  factorial(n);
        int factr =  factorial(r);
        int factnr = factorial(nr);
        int ncr = (factn) / (factr * factnr);
        return ncr;
    }




    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int r = scr.nextInt();
        System.out.println(binomial(n,r));
    }
}
