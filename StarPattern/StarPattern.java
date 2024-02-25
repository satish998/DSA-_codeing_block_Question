import java.util.Scanner;

public class StarPattern {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que7(num);
    System.out.println();
    que10(num);
    System.out.println();
    que11(num);
    System.out.println();
    que12(num);
    System.out.println();
    que21(num);
    System.out.println();
    que13(num);
    System.out.println();
    que14(num);
    System.out.println();
    que15(num);
    System.out.println();
    que16(num);
    System.out.println();
    que17(num);

  }

  /////////////////////////////////////////////////////////
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

  ////////////////////////////////////////////////////////
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

  //////////////////////////////////////////////////////////
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

  ////////////////////////////////////////////////////////
  
  //////////////////////////////////////////////////////////
  public static void que21(int n) {

    int row = 0;
    int nsp = n + 2;

    while (row < n) {
      int nst = 0;
      while (nst <= row) {
        System.out.print("*" + " ");
        nst++;
      }

      int space = 0;
      while (space < nsp) {
        System.out.print(" " + " ");
        space++;
      }

      int nst2 = 0;
      if (row == n) {
        nst2 = 1;
      }
      while (nst2 <= row) {
        System.out.print("*" + " ");
        nst2++;
      }

      System.out.println();
      nsp = nsp - 2;
      row++;
    }

  }

  // *******************************************************
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

  // **************************************************
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
  // **************************************************
  public static void que15(int n){
    int row=(n*2)-1;
    int nsp=0;
    int nst=n;

    int index=1;
    while(index<=row){
     
      int space=1;
      while(space <= nsp){
        System.out.print("   ");
        space++;
      }
      

      int star=1;
      while(star<=nst){
        System.out.print(" * ");
        star++;
      }
      if(index<n){
        nsp=nsp+2;
        nst=nst-1;
      }else{
        nsp=nsp-2;
        nst=nst+1;
      }

    System.out.println();
    index++;
    }
  }

  //*************************************************
  public static void que16(int n){
  int nst=n;
  int nsp=n-1;
  int row =(2*n)-1;
  
  int index=1;
  while(index <= row ){
    
    int space=1;
    while(space <= nsp){
      System.out.print("   ");
      space++;
    }

    int star=1;
    while(star <= nst){
      System.out.print(" * ");
       star++;
    }

    if(index<n){
    nsp=nsp-1;
    nst=nst-1;
    }else{
    nsp=nsp+1;
    nst=nst+1;
    }
  System.out.println();
  index++;
  }

}
// ******************************************************
public static void que17(int num){
  int row=num;
  int index_i=1;
  int st=(row+1)%2;
  int ed=(row+1)%2;
  while(index_i<=row){
  
   int index_j=1;
   while(index_j<=row){
     if(index_j<= st || index_j>=ed){
      System.out.print("*"+" ");
     }else{
      System.out.print("-"+" ");
     }

    index_j++;
   }
   if(index_i< (row+1)%2){
    st=st-1;
    ed=ed+1;
   }else{
    st=st-1;
    ed=ed-1;
   }
  System.out.println();
  index_i++;
  }


}
}


