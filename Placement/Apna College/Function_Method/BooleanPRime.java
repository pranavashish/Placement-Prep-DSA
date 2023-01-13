import java.util.Scanner;

public class BooleanPRime {


    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0){
                return false;
            }
        }
      return true;

    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        System.out.println(isPrime(n));
    }
}
