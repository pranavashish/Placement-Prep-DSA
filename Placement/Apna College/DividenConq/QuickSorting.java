public class QuickSorting {

    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int si, int ei ){
        //base case
        if(si>=ei){
            return;
        }
        // last element as pivot
         int pivotidx =  partition (arr,si,ei);{
            quickSort(arr,0,pivotidx-1);//left
            quickSort(arr,pivotidx,ei); //right
        }

    }

    public static int partition(int arr[], int si, int ei) {
              int pivot = arr[ei];
              int i = si-1; // smaller ko left mein daalne ko, pointer -1 pe rahega

        for (int j = 0; j < ei ; j++) {
             if(arr[j] <= pivot){
                //swap
                 i++;
                 int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
             }
            //swap
            i++;
            int temp = pivot;
            arr[ei] = arr[i];
            arr[i] = temp;

        }
        return i;

    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        quickSort(arr,0,arr.length-1);
        printarr(arr);

    }


}
