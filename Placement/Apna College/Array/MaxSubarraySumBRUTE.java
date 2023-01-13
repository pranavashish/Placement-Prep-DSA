public class MaxSubarraySumBRUTE {

    public static void subarraybrute(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum +  arr[k];
                }

                System.out.println(sum);

                if(maxsum < sum){
                    maxsum = sum;
                }
            }
        }
        System.out.println("MAX SUBARRAY IS "+ maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subarraybrute(arr);
    }
}
