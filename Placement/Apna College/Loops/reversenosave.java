public class reversenosave {
    public static void main(String[] args) {
        int n = 74568;
        int rev = 0;
        while (n > 0){
            int lastdig = n %10;
            rev = (rev*10) + lastdig;
            n = n/10;
        }
        System.out.println(rev);
    }
}
