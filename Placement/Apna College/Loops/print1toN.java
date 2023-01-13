import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();
        int num = 1;
        while(num <= N) {
            System.out.println(num);
            num++;
        }
    }
}
