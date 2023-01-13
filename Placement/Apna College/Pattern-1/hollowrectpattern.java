import java.util.Scanner;

public class hollowrectpattern {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for (int i = 1; i <= n ; i++) {
            if (i == 1 || i == n || i == n || i == 1) {
            for (int j = 1; j <= n ; j++) {
                System.out.print('*');
            }
            }
            else {
//            for (int j = 1; j <= n ; j++) {
//                if(j == n || j == 1){
//                    System.out.print('*');
//                }
//                else{
//                    System.out.print(" ");
//                }
                System.out.println(" ");
            }

            }
            System.out.println();
                }
        }



