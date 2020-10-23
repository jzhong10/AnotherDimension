import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        System.out.println(ArrayOps.sum(a1));
        System.out.println(ArrayOps.largest(a1));

        System.out.println();

        int[][] a2 = { {1, 2, 3, 4}, {4, 3, 2, 1}, {1, 2, 3}};

        int[][] A  =  {{  1,  0, 12, -1 },
                       {  7, -2,  2,  1 },
                       { -5, -2,  2, -9 }
                         };
       int[][] B  =  {{ 9, -17, 8, 11 },
                      { 11, -11, 22, -11 },
                      { 1, 2, 3, 5 },
                      { 154, -133, -5, -5}
                        };
      int[][] C  =  {{ 11, 2, 4, 6, 8 },
                     { 9, 18, 16, 14, 12},
                     { 0, 0, 0, 0, 0}
                       };
      int[][] D  =  {{ 5, 15, 6, 9 },
                     { 15, 6, 9, 5 },
                     { 9, 5, 15, 6 },
                     { 6, 9, 5, 15}
                       };
        System.out.println(Arrays.toString(ArrayOps.sumRows(a2)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(a2)));
        System.out.println(ArrayOps.sum(a2));

        System.out.println();

        System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        System.out.println(ArrayOps.sum(A));

        System.out.println("should be inverted 2D arrays");
        System.out.println(Arrays.deepToString(A));
        System.out.println(Arrays.deepToString(ArrayOps.col2row(A)));

        System.out.println("last two should be all the same");

        System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
        System.out.println(Arrays.toString(ArrayOps.sumCols(B)));
        System.out.println(Arrays.toString(ArrayOps.sumCols(C)));
        System.out.println(Arrays.toString(ArrayOps.sumCols(D)));

        System.out.println(" F T F T");

        System.out.println(ArrayOps.isRowMagic(A));
        System.out.println(ArrayOps.isRowMagic(B));
        System.out.println(ArrayOps.isRowMagic(C));
        System.out.println(ArrayOps.isRowMagic(D));

        System.out.println(" F F T T");

        System.out.println(ArrayOps.isColMagic(A));
        System.out.println(ArrayOps.isColMagic(B));
        System.out.println(ArrayOps.isColMagic(C));
        System.out.println(ArrayOps.isColMagic(D));
    }
}
