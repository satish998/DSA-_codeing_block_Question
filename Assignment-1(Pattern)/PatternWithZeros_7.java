import java.util.*;
public class PatternWithZeros_7{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    patternWithZero(n);
  }
  public static void patternWithZero(int n){
    int col=1;
    int index_i=1;
    while(index_i<=n){
      int num_print=index_i;
      int index_j=1;
      while(index_j<=col){
        if(index_j ==1 || index_j==col){
          System.out.print(num_print+"\t");
        }else{
          System.out.print("0"+"\t");
        }
        index_j++;
      }
      col++;
      index_i++;
      System.out.println();
    }
  }
}