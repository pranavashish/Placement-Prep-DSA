import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int fact = 1;
        if (n == 0 || n == 1) {
            System.out.println(fact);
        } else {
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
    }
}
