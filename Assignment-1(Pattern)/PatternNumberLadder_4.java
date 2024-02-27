import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + "\t");
                counter++;
            }
            System.out.println();
        }
    }
}
