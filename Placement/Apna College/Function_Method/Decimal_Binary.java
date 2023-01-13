public class Decimal_Binary {

     public static void decToBin(int DecNum){
         int pow = 0;
         int BinNum = 0;

         while (DecNum > 0){
             int remainder = DecNum % 2;
             BinNum =BinNum + (remainder * (int)Math.pow(10, pow));
             pow++;
             DecNum =DecNum/2;
         }
         System.out.println(BinNum);
     }

    public static void main(String[] args) {
          decToBin(7);
    }
}
