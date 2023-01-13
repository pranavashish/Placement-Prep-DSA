public class NumberToString {

    public static void convert(int num){
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine" };
        if(num == 0){
            return;
        }
        int nums = num%10;
        num = num/10;


        convert(num);
        System.out.print(arr[nums] +" ");


    }

    public static void main(String[] args) {
      int num = 1455;
      convert(num);

    }


}
