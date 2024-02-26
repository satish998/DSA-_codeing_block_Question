import java.util.*;
public class PatternTriangle{
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); 
    patternTriangle(n);
    }
    public static void patternTriangle(int n){
    int nsp=n-1;
    int number=1;

    int index=1;
    while(index<=n){
      
      int space=1;
      while(space<=nsp){
        System.out.print(" "+"\t");
        space++;
      }

      int num=index;
      int j=1;
      while(j<=number){
        System.out.print(num+"\t");
        
        if(j < (number+1)/2){
          num++;
        }else{
          num--;
        }
        j++;
      }

      number=number+2;
      nsp=nsp-1;
      index++;
      System.out.println();
    }
  }
  
}
