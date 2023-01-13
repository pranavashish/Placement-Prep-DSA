public class MergeSorting {


    //sorting method (to do step1(divide) & step2(sort parts))
    public static void mergeSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2; // or = (si + ei) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    //merge method to merge the sorted parts
    public static void merge(int arr[], int si, int mid, int ei) {
        // left(0,3) = 4, right(4,6) = 3 ==> 6-0+1
        int temp[] = new int[ei-si+1];
        int i = si; // for left part
        int j = mid+1; // for right part
        int k = 0; // for temp array

        while(i<= mid && j <=ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }

        //for leftover elements of 1st sorted part
            while(i <= mid){
                temp[k++] = arr[i++];
            }

        //for leftover elements of 2nd sorted part
            while(j <= ei){
                temp[k++] = arr[j++];
            }

            //copy temp to original array
            for ( k = 0, i=si; k < temp.length; k++, i++) {
                arr[i] = temp[k];
            }
        }


    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {6,3,9,5,2,8,-2};
        mergeSort(arr,0,arr.length-1);
        printarr(arr);
    }


}
