import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scr.nextInt();
        }

        Arrays.sort(arr);

        int n = scr.nextInt();

        System.out.println(arr[n-1]);
    }
}

