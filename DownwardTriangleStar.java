public class DownwardTriangleStar {
  public static void main(String[] args)
  {
    int numberOfRows = 7;
    for (int i = numberOfRows - 1; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }

      //New line for new row
      System.out.println();
    }
  }
}