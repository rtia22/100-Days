import java.util.Scanner;

public class Day040 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int total_belanja;
        double harga_akhir = 0;

        System.out.print("Total Belanja: Rp.");
        total_belanja = input.nextInt();
        System.out.println();

        if ((total_belanja >= 80000) && (total_belanja < 100000)) {
            harga_akhir = total_belanja - (0.1 * total_belanja);
            System.out.println("Selamat, anda mendapat diskon 10%");
        } else if ((total_belanja >= 100000) && (total_belanja < 300000)) {
            harga_akhir = total_belanja - (0.2 * total_belanja);
            System.out.println("Selamat, anda mendapat diskon 20%");
        } else if ((total_belanja >= 300000) && (total_belanja <= 500000)) {
            harga_akhir = total_belanja - (0.3 * total_belanja);
            System.out.println("Selamat, anda mendapat diskon 30%");
        } else if ((total_belanja < 80000) || (total_belanja > 1000000)) {
            System.out.println("Anda Tidak Mendapatkan diskon");
            harga_akhir = total_belanja;
        }

        System.out.println("Total bayar: Rp." + harga_akhir);
    }
}
