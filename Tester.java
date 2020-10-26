import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[][] A = {{1,0,12,-1}, {7,-2,2,1}, {-5,-2,2,-9}};
    int[] B = {1, 3, 5};
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    System.out.println(ArrayOps.sum(B));
    System.out.println(ArrayOps.sum(A));
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    int[][] R = {{1,2,3,4}, {2,3,4,1}, {3,4,1,2}};
    int[][] C = {{1,1,1}, {2,2,2}, {3,3,3}};
    int[][] D = {{2,2,2}, {2,2,2}};
    System.out.println(ArrayOps.isRowMagic(R));
    System.out.println(ArrayOps.isColMagic(R));
    System.out.println(ArrayOps.isRowMagic(C));
    System.out.println(ArrayOps.isColMagic(C));
    System.out.println(ArrayOps.isRowMagic(D));
    System.out.println(ArrayOps.isColMagic(D));
  }
}
