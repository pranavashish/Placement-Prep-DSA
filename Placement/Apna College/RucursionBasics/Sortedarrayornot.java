public class Sortedarrayornot {

    public static boolean sorted(int arr[], int n) {
         // base case
        if(n == arr.length-1){
            return true;
        }


        if(arr[n] > arr[n+1]){
         return false;
        }

        return sorted(arr,n+1);
    }
    public static void main(String[] args) {
      int arr[]= {1,2,3,4,5};
        System.out.println(sorted(arr,0));
    }


}
