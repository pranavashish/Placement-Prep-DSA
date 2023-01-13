import java.util.Scanner;

public class invertedstar {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
