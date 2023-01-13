public class checkpowerof2 {

    public static boolean powof2( int n) {
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(powof2(16));

    }

}
