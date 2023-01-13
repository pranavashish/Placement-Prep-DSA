import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int prod;
        for (int i = 1; i <= 10; i++) {
            prod = n*i;
            System.out.println(n+" x "+i+" = "+prod);
        }

    }
}
