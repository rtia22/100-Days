
import java.util.Scanner;

public class Day060 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Penjumlahan Deret Angka");
        System.out.println();

        int i, n, total;

        System.out.print("Input jumlah deret yang diinginkan: ");
        n = input.nextInt();
        System.out.println();

        total = 1;
        System.out.print(1);
        i = 2;
        while (i <= n) {
            System.out.print(" + " + i);
            total = total + i;
            i++;
        }

        System.out.println(" = " + total);

        input.close();
    }
}
