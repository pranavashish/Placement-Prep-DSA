public class Updateithbit {

    public static int setithbit( int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask ;

    }
    public static int clrithbit( int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int update( String str, int n , int i) {
        if(str == "set"){
            return setithbit(n,i);
        } else if (str == "clr") {
            return clrithbit(n,i);
        }
        else{
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(update("clr",10,2));

    }



}
