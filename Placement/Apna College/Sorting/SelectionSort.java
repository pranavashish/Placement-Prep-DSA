public class SelectionSort {


    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length-1 ; i++) {
            int smallestpos = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[smallestpos] > arr[j]){
                   smallestpos =j;
                }
            }
            //swap
            int temp = arr[smallestpos];
            arr[smallestpos] = arr[i];
            arr[i] = temp;
        }
        }

    public static void printarr (int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selection(arr);
        printarr(arr);
    }
}