public class ArrayOps {
  public static int sum(int[] arr) {
    int x = 0;
    for (int i = 0; i < arr.length; i++) {
      x += arr[i];
    }
    return x;
  }
}
