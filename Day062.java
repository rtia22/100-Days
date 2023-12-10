
import java.util.Scanner;

public class Day062 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Segitiga Angka");;
        System.out.println();

        int tinggi_segitiga, i, j, k = 0;

        System.out.print("Input tinggi segitiga: ");
        tinggi_segitiga = input.nextInt();

        System.out.println();

        for (i = 1; i <= tinggi_segitiga; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");
        System.out.println();

        for (i = 1; i <= tinggi_segitiga; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");
        System.out.println();

        for (i = 1; i <= tinggi_segitiga; i++) {
            for (j = 1; j <= i; j++) {
                k++;
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
