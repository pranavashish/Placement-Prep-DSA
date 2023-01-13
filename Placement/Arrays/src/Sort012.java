import java.util.Scanner;

public class Sort012 {

    public static void sort(int arr[]){
        int start = 0;
        int mid = 0;
        int end = arr.length-1;
        int temp;

        while(mid<=end){
            if(arr[mid] == 0){
                temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                mid++;
                start++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end--;
            }

        }
    }


    public static void main(String[] args) {

        int arr[] = {1,1,1,1,2,2,2,2,0,0,0,0,2,2,1,0,1};
        sort(arr);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

