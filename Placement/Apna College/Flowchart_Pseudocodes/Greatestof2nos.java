import java.util.Scanner;

public class Greatestof2nos {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double num1 = scr.nextDouble();
        double num2 = scr.nextDouble();
        if(num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }

    }
}
