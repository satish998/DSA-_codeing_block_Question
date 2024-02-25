import java.util.Scanner;

public class Que_14 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que14(num);
  }
  public static void que14(int n) {
    int row = (2 * n) - 1;
    int nst = 1;
    int nsp = n - 1;
    int i = 1;
    while (i <= row) {

      int j = 1;
      while (j <= nsp) {
        System.out.print(" " + " ");
        j++;
      }

      int k = 1;
      while (k <= nst) {
        System.out.print("*" + " ");
        k++;
      }
      if (n > i) {
        nst++;
        nsp--;
      } else {
        nst--;
        nsp++;
      }
      i++;
      System.out.println();
    }
  }
}
