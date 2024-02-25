import java.util.Scanner;

public class Que_17 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = obj.nextInt();
    que17(num);
  }
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
