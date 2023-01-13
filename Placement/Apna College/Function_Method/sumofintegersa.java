public class sumofintegersa {

    public static void sumation(int n){
        int num = n;
        int rem = 0;
        int sum = 0;
        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
      sumation(12345);
    }
}
