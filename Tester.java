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
        System.out.println(Arrays.toString(ArrayOps.sumRows(a2)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(a2)));
        System.out.println(ArrayOps.sum(a2));

        System.out.println();

        System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        System.out.println(ArrayOps.sum(A));

        System.out.println(Arrays.deepToString(A));
        System.out.println(Arrays.deepToString(ArrayOps.col2row(A)));
    }
}
