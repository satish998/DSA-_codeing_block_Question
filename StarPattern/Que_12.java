import java.util.Scanner;

public class Que_12 {
  public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que12(num);
  }
  public static void que12(int n) {
    int row = 0;
    int space = n;
    int row1 = row;

    while (row < n) {

      int col1 = 0;
      while (col1 < space) {
        System.out.print(" ");
        col1++;
      }

      int col = 0;
      while (col <= row1) {
        if (col % 2 == 0) {
          System.out.print("*");
        } else {
          System.out.print("!");
        }
        col++;
      }

      System.err.println();
      row1 = row1 + 2;
      row++;
      space--;
    }
  }
}
