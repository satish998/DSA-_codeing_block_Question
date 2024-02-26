import java.util.*;
public class MirrorStarPattern5 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    mirrorStar(n);
  }
  public static void mirrorStar(int n){
   int  nsp=((n+1)/2) -1;
   int nst=1;

   int index=1;
   while(index<=n){

    int space=1;
    while(space<=nsp){
      System.out.print(" "+"\t");
      space++;
    }

    int star=1;
    while(star<=nst){
      System.out.print("*"+"\t");
      star++;
    }

    if(index < (n+1)/2){
      nsp--;
      nst=nst+2;
    }else{
      nsp++;
      nst=nst-2;
    }
    System.out.println();
    index++;
   }

  } 
}
