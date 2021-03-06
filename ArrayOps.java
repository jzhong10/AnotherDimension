public class ArrayOps {

    public static void main(String[] args) {

    }

    public static int sum(int[] arr) {
      int sum = 0;
      for (int i = 0; i<arr.length; i++) {
        sum += arr[i];
      }
      return sum;
    }

    public static int largest(int[] arr) {
      int large = arr[0];
      for (int i = 1; i<arr.length; i++) {
        if (arr[i]>large) {
          large = arr[i];
        }
      }
      return large;
    }

    public static int[] sumRows(int[][] matrix) {
      int[] x = new int[matrix.length];
      for (int i = 0; i<matrix.length; i++) {
        x[i] = sum(matrix[i]);
      }
      return x;
    }

    public static int[] largestInRows(int[][] matrix) {
      int[] x = new int[matrix.length];
      for (int i = 0; i<matrix.length; i++) {
        x[i] = largest(matrix[i]);
      }
      return x;
    }

    public static int sum(int[][] arr) {
      return sum(sumRows(arr));
      //returns the sum of the sum of the rows which is the sum of all the values in the array
    }

    // since I'm lazy, I'm going to write a helper function that turns cols into rows
    // so I can use all the functions that work for rows
     public static int[][] col2row(int[][] matrix) {
       int[][] x = new int[matrix[0].length][matrix.length];
       for (int col = 0; col<matrix[0].length; col++) {
         for (int row = 0; row<matrix.length; row++) {
           x[col][row] = matrix[row][col];
         }
       }
       return x;
     }

     public static int[] sumCols(int[][] matrix) {
       int[][] r_Matrix = col2row(matrix);
       return sumRows(r_Matrix);
     }

     public static boolean isRowMagic(int[][] matrix) {
       for (int i = 1; i<matrix.length; i++) {
         if (sum(matrix[i]) != sum(matrix[i-1])) {
           return false;
         }
       }
       return true;
     }

     //doing isrowmagic, but for a matrix where the rows and columns are switched
     public static boolean isColMagic(int[][] matrix) {
       int[][] r_Matrix = col2row(matrix);
       return isRowMagic(r_Matrix);
     }

     public static boolean isLocationMagic(int[][] matrix, int row, int col) {
       int[][] r_matrix = col2row(matrix);
       if (sum(matrix[row]) == sum(r_matrix[col])) {
         return true;
       }
       return false;
     }
}
