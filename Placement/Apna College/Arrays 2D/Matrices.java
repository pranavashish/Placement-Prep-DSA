import java.util.Scanner;

public class Matrices {

    public static void searchlands(int mat[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length ; j++) {
                if(largest < mat[i][j]){
                    largest = mat[i][j];
                }
                if(smallest > mat[i][j]){
                    smallest = mat[i][j];
                }
            }
        }
        System.out.println("Largest is " + largest);
        System.out.println("Smallest is " + smallest);
    }

    public static boolean search( int mat[][], int key ) {
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[0].length ; j++) {
                if(mat[i][j] == key){
                    System.out.println("Element found at " + i +"," + j + " position");
                    return true;
                }
            }

        }
        System.out.println("Not found");
        return false;

    }



    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
     int matrix [][] = new int[3][3];
     int n = matrix.length,  m = matrix[0].length;

     // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scr.nextInt();
            }
        }
     //output
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix,8);
        searchlands(matrix);

    }
}
