public class Tiles {

  public static int tile(int n){
      // base
      if(n==0 || n==1){
          return 1;
      }
//      int fnm1 = tile(n-1);
//      int fnm2 = tile(n-2);
//
//      return fnm1+fnm2;

      return tile(n-1)+tile(n-2);
  }
    public static void main(String[] args) {
        System.out.println(tile(4));

    }


}
