import java.util.Scanner;

public class sumofoddeven {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int i = 1;
        // int j = 1;
        int even_sum = 0;
        int odd_sum = 0;

        while (i<=n) {
            if (i%2==0) {
                even_sum = even_sum+i;
            }
            else{
                odd_sum = odd_sum+i;
            }
            i++;
        }



        System.out.println("even no. is " + even_sum + "  "  + "odd no. is"  + " " +  odd_sum);
//
//         int num;
//         int even = 0;
//         int odd = 0;
//         int choice;
//        do{
//
//            num = scr.nextInt();
//
//            if(num % 2 == 0){
//                even += num;
//            } else {
//                odd += num;
//            }
//
//            choice = scr.nextInt();
//
//        } while (choice == 1);
//
//        System.out.println(even);
//        System.out.println(odd);


    }
}
