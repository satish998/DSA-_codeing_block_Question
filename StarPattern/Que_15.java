import java.util.Scanner;

public class Que_15 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que15(num);
  }
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
}
