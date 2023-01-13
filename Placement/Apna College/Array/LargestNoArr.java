import java.util.*;
public class LargestNoArr {

    public static int large(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }

        }
        System.out.println(smallest);
        return largest;


    }
    public static void main(String[] args) {
       int number[] = {1,2,6,3,5};
        System.out.println(large(number));
    }
}
