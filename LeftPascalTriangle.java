public class LeftPascalTriangle
{
  public static void main(String[] args)
  {
    //This represents the row with the max stars
    int rows=5;
 
    for (int i= 1; i<=rows; i++)
    {
      //Prints the spaces before the first star of each row
      for (int j=i; j<rows; j++)
      {
        System.out.print(" ");
      }
      //Prints the stars for each row
      for (int k=1; k<=i;k++)
      {
        System.out.print("*");
      }
      //To move the cursor to new line after printing row
      System.out.println();
    }
    //Outer Loop 2: Prints second half of the triangle
    for (int i=rows; i>=1; i--)
    {
      //Prints the whitespaces before the first star of each row
      for(int j=i; j <=rows;j++)
      {
        System.out.print(" ");
      }
      //Prints stars of each row
      for(int k=1; k<i ;k++)
      {
        System.out.print("*");
      }
      //To move the cursor to new line after printing row
      System.out.println();
    }
  }
}  