import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistrubution {
    public static void Choco(int arr[], int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i+m-1 < arr.length; i++) {
            if((arr[i+m-1] - arr[i]) < min){
                min = arr[i+m-1] - arr[i];
            }

        }

        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scr.nextInt();
        }
        int m = scr.nextInt();

        Choco(arr,m);
    }
}
