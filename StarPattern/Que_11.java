import java.util.Scanner;

public class Que_11 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que11(num);
  }
  public static void que11(int n) {
    int row = 0;
    int space = n;
    while (row < n) {
      int col1 = 0;
      while (col1 < space) {
        System.out.print(" ");
        col1++;
      }

      int col = 0;
      while (col++ <= row) {
        System.out.print(" *" + " ");
      }
      System.err.println();
      row++;
      space--;
    }

  }
}
