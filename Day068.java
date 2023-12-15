
import java.util.Scanner;

public class Day068 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[32];
        int n, i;

        System.out.print("Input angka desimal: ");
        n = input.nextInt();

        for (i = 0; n > 0; i++) {
            arr[i] = n % 2;
            n = n / 2;
        }

        System.out.print("Angka binernya adalah: ");

        for (i = i - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }
}
