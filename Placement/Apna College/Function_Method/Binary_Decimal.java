public class Binary_Decimal  {

    public static void bintodic(int binNum) {
        int pow = 0;
        int decNum = 0;

        while (binNum > 0){
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println(decNum);
    }

    public static void main(String[] args) {

        bintodic(1010);
    }
}
