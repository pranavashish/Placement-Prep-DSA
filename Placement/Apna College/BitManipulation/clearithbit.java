public class clearithbit {


    public static int clrithbit( int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask ;



    }
    public static void main(String[] args) {
        System.out.println(clrithbit(10,2));

    }



}
