import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner scr =  new Scanner(System.in);
        int n = scr.nextInt();
        for (int i =2; i <= n/2 ; i++) {
           if(n%i==0){
               System.out.println("Not prime");
               break;
           }
           else{
               System.out.println("Prime");
               break;
           }
        }
    }
}
