import java.util.Scanner;

public class MaxMinArray {

    public static void maxmin(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
            for( int i = 0; i < size; i++) {
            arr[i] = scr.nextInt();
            }
        maxmin(arr);

    }
}
