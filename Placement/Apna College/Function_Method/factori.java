import java.util.Scanner;

public class factori {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n ; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(factorial(num));
    }
}
