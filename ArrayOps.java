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

}
