public class xtothepowern {

    public static int power(int x, int n) {
        if(n == 0){
            return 1;
        }

        return  x * power(x,n-1);


    }

    public static int poweropt(int x, int n) {
        if(n == 0){
            return 1;
        }

        int powerr = poweropt(x,n/2);
        int powerfinal = powerr * powerr;

        if(n%2==0){
            return  powerfinal;
        } else{
            return  x * powerfinal;

        }


    }

    public static void main(String[] args) {
        System.out.println( poweropt(2,3));

    }


}
