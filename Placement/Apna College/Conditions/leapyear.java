import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int year = scr.nextInt();

        if(year%4==0){
            if (year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else {
            System.out.println("Not a leap year");
        }
    }

}
