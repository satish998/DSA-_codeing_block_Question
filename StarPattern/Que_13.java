import java.util.Scanner;

public class Que_13 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que13(num);
   
  }
  public static void que13(int n) {
    int nst = 1;
    int row = (n*2) -1;

    int i = 1;
    while (i <= row) {

      int j = 1;
      while (j <= nst) {
        System.out.print("*" + " ");
        j++;
      }
      if (i < n) {
        nst = nst + 1;
      } else {
        nst = nst - 1;
      }

      System.out.println();
      i++;
    }
  }
  
}
