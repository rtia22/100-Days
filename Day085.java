
import java.util.Scanner;


public class Day085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0){
            System.out.print("+");
            for (int i = 0; i < n; i++) {
                System.out.print("---+");
            }
            System.out.println();
            
            System.out.print("|");
            for (int i = 0; i < n; i++) {
                System.out.print(" * |");
            }
             System.out.println();
             
             System.out.print("+");
            for (int i = 0; i < n; i++) {
                System.out.print("---+");
            }
             System.out.println();
        }
    }
 
}
