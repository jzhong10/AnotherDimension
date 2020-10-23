public class Tester {
    public static void main(String[] args) {
        int[]a1 = {1, 2, 3, 4};
        System.out.println(ArrayOps.sum(a1));
        System.out.println(ArrayOps.largest(a1));

        System.out.println();

        int[][] a2 = { {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3}};
        System.out.println(ArrayOps.sumRows(a2));
    }
}
