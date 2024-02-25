import java.util.Scanner;

public class Que_7 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que7(num);
  }
  
  public static void que7(int num) {
    for (int i = 0; i < num; i++) {
      System.out.print("*" + " ");
    }
    System.out.println();
    //////////////////////////////////////////
    int row = 0;
    while (row < num - 2) {
  
      int j = 0;
      while (j < num) {
        if (j == 0 || j == num - 1) {
          System.out.print("*" + " ");
        } else {
          System.out.print(" " + " ");
        }
        j++;
      }
      System.out.println();
      row++;
    }
    /////////////////////////////////////////
    for (int i = 0; i < num; i++) {
      System.out.print("*" + " ");
    }
  }
  
}
