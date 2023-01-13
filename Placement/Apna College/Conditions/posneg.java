import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
