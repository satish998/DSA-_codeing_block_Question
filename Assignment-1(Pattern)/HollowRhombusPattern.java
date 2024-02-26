import java.util.*;
public class HollowRhombusPattern {
   public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int num = obj.nextInt();
    hallowRombus(num);
  }
  public static void hallowRombus(int n){
    int nsp=n-1;
    int nst=n;
    
    int index=1;
    while(index<=n){
      int space=1;
      while(space<=nsp){
        System.out.print(" "+"\t");
        space++;
      }

      int star=1;
      while(star<=nst){
        if(index ==1 || index ==n){
          System.out.print("*"+"");
        }else{
          if(star==1 || star==n){
            System.out.print("*"+"");
          }else{
            System.out.print(" "+"");
          }
        }
        star++;
      }
      nsp--;
      index++;
      System.out.println();
    }

  }
}