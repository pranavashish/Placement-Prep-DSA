public class MaxSubarrayKadaneAlgo  {

    public static void kadanes(int arr[]) {
       int ms = Integer.MIN_VALUE;
       int cs = 0;

        for (int i = 0; i < arr.length ; i++) {
           cs += arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }

        System.out.println(ms);


    }


    public static void main(String[] args) {

        //int number[] = {-2,-3,4,-1,-2,1,5,-3};
        int number[] = {-1,-2,-3,-4};
        kadanes(number);
    }
}
