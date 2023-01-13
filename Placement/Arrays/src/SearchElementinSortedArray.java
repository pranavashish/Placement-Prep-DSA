import java.util.Scanner;

public class SearchElementinSortedArray {


    public static int search(int arr[], int key) {

        /* BInary Search
           TC - O(log n)
           SC - O(1)
        */

        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (key == arr[mid]) {
                return mid;
            } else if (arr[start] <= arr[mid]) {
                if (key >= arr[start] && key <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (key >= arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

        /*
        Brute force (Linear Search)
        Time - O(N)
        Space - O(1)
         */
//        int i;
//        int count = 0;
//        for (i = 0; i < arr.length; i++) {
//
//            if (key == arr[i]) {
//                System.out.println("Found at index " + i);
//                count++;
//            }
//        }
//        if (count == 0) {
//            System.out.println("Not Found");
//        }
//    }


        public static void main (String[]args){

            Scanner scr = new Scanner(System.in);
            int size = scr.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scr.nextInt();
            }

            int key = scr.nextInt();
            System.out.println(search(arr, key));
        }

}
