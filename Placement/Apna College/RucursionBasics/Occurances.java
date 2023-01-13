public class Occurances {

    public static void occur(int[] arr, int key, int idx) {
        if(idx == arr.length){
            return;
        }
        if(key == arr[idx]){
            System.out.print(idx + " ");;
        }
        occur(arr,key,idx+1 );
    }

    public static void main(String[] args) {
      int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
      occur(arr,2,0);
    }


}
