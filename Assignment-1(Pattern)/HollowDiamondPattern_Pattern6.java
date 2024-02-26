
import java.util.*;
public class HollowDiamondPattern_Pattern6{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    hollowDiamond(n);
  }
  
  public static void hollowDiamond(int n){
    int nst=(n+1)/2;
    int nsp=-1;

    int index=1;
    while(index<=n){
     
      int star=1;
      while(star<= nst){
        System.out.print("*"+"\t");
        star++;
      }

      int space=1;
      while(space<=nsp){
        System.out.print(" "+"\t");
        space++;
      }

      int star2 = 1;
      if(index==1 || index == n){
        star2=2;
      }
      while(star2<= nst){
        System.out.print("*"+"\t");
        star2++;
      }

      if(index< (n+1)/2){
        nst--;
        nsp=nsp+2;
      }else{
        nst++;
        nsp=nsp-2;
      }

     index++;
     System.out.println();
    }
  }
}