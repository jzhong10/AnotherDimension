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
}
