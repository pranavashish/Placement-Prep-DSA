import java.util.Scanner;

public class ReversseArray {

    public static void Reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            while(start <= end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
                }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scr.nextInt();
        }
        Reverse(arr);

    }



}
