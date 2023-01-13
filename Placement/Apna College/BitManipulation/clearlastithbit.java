public class clearlastithbit {


    public static int clrlastithbit( int n, int i) {
        int bitMask = ((~0) << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clrlastithbit(15,2));

    }


}
