public class FriendsPairing {


    public static int party(int n) {
         if(n == 1){
             return 1;
         }
        if(n == 2){
            return 2;
        }

        //choice

        // single
        int fnm1 = party(n-1);

        //pair
        int fnm2 = party(n-2);
        int pairWays = (n-1) * fnm2;

        // total
        return fnm1 * pairWays;

       // return party(n-1) + (n-1) * party(n-2);

    }

    public static void main(String[] args) {


    }


}
