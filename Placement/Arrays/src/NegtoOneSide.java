import java.util.Scanner;

public class NegtoOneSide {

    public static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
    public static void move(int arr[]){
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            if(arr[start] <= 0){
                start++;
            }
            else{
                swap(arr, start, end);
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scr.nextInt();
        }

        move(arr);

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }
}
