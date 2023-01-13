public class printsumfirstnnatnum {

    public static int sum(int n) {
        // base

        if(n==1){
            return 1;
        }

        int sums = n + sum(n-1);
        return sums;

    }
    public static void main(String[] args) {
            int n = 5;
        System.out.println(sum(n));

    }


}
