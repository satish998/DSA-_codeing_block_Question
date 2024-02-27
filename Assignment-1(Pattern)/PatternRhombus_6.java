import java.util.*;
public class PatternRhombus_6 {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    patternRombus(n);
  }
  public static void patternRombus(int n){
    int nsp=n-1;
    int num=1;
    int no_col=1;

    int index_i=1;
    while(index_i<= ((2*n)-1)){
      int space=1;
      while(space<=nsp){
        System.out.print(" "+"\t");
        space++;
      }

      int no_print=num;
      int index_j=1;
      while(index_j <=no_col){
        System.out.print(no_print+"\t");
        if(index_j< (no_col+1)/2 ){
          no_print++;
        }else{
          no_print--;
        }

        index_j++;
      }
      if(index_i< (2*n)/2){
        no_col=no_col+2;
        num=num+1;
        nsp--;
      }else{
        no_col=no_col-2;
        num=num-1;
        nsp++;
      }
      index_i++;
      System.out.println();

    }

  }
}