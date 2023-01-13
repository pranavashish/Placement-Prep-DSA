public class lastoccurance {


    public static int lastoccur(int arr[], int key, int i) {
        if(i == -1){
            return -1;
        }

        if(key == arr[i]){
            return i;
        }
        return lastoccur(arr,key,i-1);

    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastoccur(arr,5, arr.length-1));
    }


}
