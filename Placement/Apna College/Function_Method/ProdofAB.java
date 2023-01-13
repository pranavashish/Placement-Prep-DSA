import java.util.Scanner;

public class ProdofAB {

    public static int product(int a, int b){
        int prod = a*b;
        return prod;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        System.out.println(product(a,b));

    }
}
