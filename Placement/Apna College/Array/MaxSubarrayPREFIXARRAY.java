public class MaxSubarrayPREFIXARRAY {

    public static void subarrayprefix(int arr[]) {
        int sum = 0;
        int maxSUm = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
// caculate prefix array
        for (int i = 1; i < prefix.length ; i++) {
           prefix[i] = prefix[i-1] + arr[i];
        }
// subarray sum

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSUm < sum){
                    maxSUm = sum;
                }
            }
        }

        System.out.println(maxSUm);


    }

    public static void main(String[] args) {
       int arr[] = {1,-2,6,-1,3};
       subarrayprefix(arr);
    }
}
