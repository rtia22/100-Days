
import java.util.Scanner;


public class Day056 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Program Java Menghitung Jumlah Huruf Vokal ");
        System.out.println();

        String x;
        int vokal = 0;
        char ch;

        System.out.print("Input kata / kalimat: ");
        x = input.nextLine();

        for (int i = 0; i < x.length(); i++) {
            ch = x.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                vokal++;
            }
        }

        // Tampilkan total huruf vokal jika ditemukan
        if (vokal > 0) {
            System.out.println("Jumlah huruf vokal = " + vokal);
        } else {
            System.out.println("Huruf vokal tidak ditemukan");
        }

    }

}
