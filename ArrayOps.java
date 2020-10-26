public class ArrayOps {
  public static int sum(int[] arr) {
    int x = 0;
    for (int i = 0; i < arr.length; i++) {
      x += arr[i];
    }
    return x;
  }
  public static int largest(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] a = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      a[i] = sum(matrix[i]);
    }
    return a;
  }
  public static int[] largestInRows(int[][] matrix) {
    int[] a = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      a[i] = largest(matrix[i]);
    }
    return a;
  }
  public static int sum(int[][] arr) {
    int x = sum(sumRows(arr));
    return x;
  }
  public static int[] arrayCols(int[][] arr, int cols) {
    //arranges all values at a certain column into an array
    int[] a = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      a[i] = arr[i][cols];
    }
    return a;
  }
  public static int[] sumCols(int[][] matrix) {
    int[] a = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      a[i] = sum(arrayCols(matrix, i));
    }
    return a;
  }
  
}
