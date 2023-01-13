import java.util.Scanner;

public class multipleof10break {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        do{
            int n = scr.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println(n);
        }while (true);
    }
}
