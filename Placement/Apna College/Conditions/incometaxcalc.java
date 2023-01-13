import java.util.Scanner;

public class incometaxcalc {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int income = scr.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
            System.out.println("Tax : " + tax);
            System.out.println("Total : " + (income-tax));
        } else if (income >= 500000 && income < 1000000 ) {
            tax = (int) (income * 0.2);
            System.out.println("Tax : " + tax);
            System.out.println("Total : " + (income-tax));
        }
        else{
            tax = (int) (income * 0.3);
            System.out.println("Tax : " + tax);
            System.out.println("Total : " + (income-tax));

        }
    }
}
