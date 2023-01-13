public class numbersindecreasingorder {

    public static void printDec(int n){
        if(n==1){
            System.out.print (1);
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String[] args) {
      int n = 10;
   printDec(n);
    }


}
