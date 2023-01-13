public class TransposeMatrix {

    public static void Transpose(int array[][]){
        for (int i = 0; i < array[0].length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] array = { {1,2,3},{4,5,6} };
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        Transpose(array);

    }


}
