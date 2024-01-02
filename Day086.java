
import java.util.Scanner;

public class Day086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int n = st.length();
        if (n > 0) {
            System.out.print("+");
            for (int i = 0; i < n; i++) {
                System.out.print("---+");
            }
            System.out.println();

            System.out.print("|");
            for (int i = 0; i < n; i++) {
                int value = Integer.parseInt(String.valueOf(st.charAt(i)));
                if (value == 1) {
                    System.out.print(" x |");
                } else if(value == 0) {
                    System.out.print(" o |");
                }else{
                    System.out.print("   |");
                }
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
