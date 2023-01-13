public class SumofSecondRow {


    public static void secondsum(int mat[][]){
        int sum = 0;

            for (int j = 0; j < mat[0].length ; j++) {
                sum += mat[1][j];
            }


        System.out.println(sum);
    }


    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        secondsum(nums);
    }


}
