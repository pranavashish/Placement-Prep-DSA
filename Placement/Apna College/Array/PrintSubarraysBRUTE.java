public class PrintSubarraysBRUTE {

    public static void subs(int arr[]){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                for (int k =i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }


                System.out.print("[Sum of subarray " + sum+"]" );
                count++;
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays "  +count);
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subs(number);
    }
}
