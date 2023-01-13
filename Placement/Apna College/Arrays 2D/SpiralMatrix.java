public class SpiralMatrix {


    public static void spiral(int mat[][]){
      int startRow = 0;
      int endRow = mat.length-1;
      int startCol = 0;
      int endCol = mat[0].length-1;

      while (startRow <= endRow && startCol <= endCol){
          // Top
          for (int j = startCol; j <= endCol ; j++) {
              System.out.print(mat[startRow][j] + " ");
          }
          // right
          for (int i = startRow+1; i <=endRow ; i++) {
              System.out.print(mat[i][endCol] + " ");
          }
          // bottom
          for (int j = endCol-1; j >= startCol ; j--) {
              if(startRow == endRow){
                  return;
              }
              System.out.print(mat[endRow][j] +" ");
          }
          // left
          for (int i = endRow-1; i >= startRow+1 ; i--) {
              if(startCol == endCol){
                  return;
              }
              System.out.print(mat[i][startCol]+ " ");
          }

          startRow++;
          startCol++;
          endCol--;
          endRow--;

      }


    }


    public static void main(String[] args) {
        int matrix [][] ={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        spiral(matrix);
    }
}
