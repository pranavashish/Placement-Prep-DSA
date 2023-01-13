import java.util.Scanner;

public class sumfirstNnos {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();
        int num = 1;
        int sum = 0;
        while(num <= N) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }

}
