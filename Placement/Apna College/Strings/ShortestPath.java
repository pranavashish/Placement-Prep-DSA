public class ShortestPath {

    public static double getPath(String str){
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            // South
            if(dir == 'S'){
                y--;
            }
            // North
            else if(dir == 'N'){
                y++;
            }
            // East
            else if(dir == 'E'){
                x++;
            }
            // West
            else {
                x--;
            }

        }
        int X2 = x*x;
        int Y2 = y*y;
        return Math.sqrt(X2 + Y2);

    }


    public static void main(String[] args) {
      String str = "WNEENESENNN";
        System.out.println(getPath(str));
    }


}
