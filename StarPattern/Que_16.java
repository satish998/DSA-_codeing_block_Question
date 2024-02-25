import java.util.*;

public class Que_16 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que16(num);
  }

  public static void que16(int n) {
    int nst = n;
    int nsp = n - 1;
    int row = (2 * n) - 1;

    int index = 1;
    while (index <= row) {

      int space = 1;
      while (space <= nsp) {
        System.out.print("   ");
        space++;
      }

      int star = 1;
      while (star <= nst) {
        System.out.print(" * ");
        star++;
      }

      if (index < n) {
        nsp = nsp - 1;
        nst = nst - 1;
      } else {
        nsp = nsp + 1;
        nst = nst + 1;
      }
      System.out.println();
      index++;
    }
  }
}