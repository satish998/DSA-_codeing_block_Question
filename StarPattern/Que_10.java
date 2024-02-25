import java.util.Scanner;

public class Que_10 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que10(num);
  }
  public static void que10(int n) {
    int row = 0;
    int nst = (2 * n) - 1;
    int nsp = 0;
    while (row++ < n) {

      int i = 0;
      while (i < nsp) {
        System.out.print(" " + " ");
        i++;
      }

      int j = 0;
      while (j < nst) {
        System.out.print("*" + " ");
        j++;
      }
      System.out.println();
      nsp++;
      nst = nst - 2;

    }
  }

}
