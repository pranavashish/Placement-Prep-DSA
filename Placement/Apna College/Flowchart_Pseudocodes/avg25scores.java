import java.util.Scanner;

public class avg25scores {
    public static void main(String[] args) {
     int i = 1;
     Scanner scr = new Scanner(System.in);
     double marks;
     double total = 0;
     while (i <= 25){
         marks = scr.nextDouble();
         total = marks + total;
         i++;
     }
     double avg = total/25;
        System.out.println(avg);
    }
}
