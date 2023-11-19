

import java.util.Scanner;

public class CetakBilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cetak Bilangan Prima Antara Dua Nilai");
        System.out.println();

        int nilaiAwal, nilaiAkhir;

        System.out.print("Input nilai awal: ");
        nilaiAwal = input.nextInt();

        System.out.print("Input nilai akhir: ");
        nilaiAkhir = input.nextInt();

        System.out.println("Bilangan prima antara " + nilaiAwal + " dan " + nilaiAkhir + " adalah:");

        // Cetak bilangan prima di antara dua nilai
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            boolean angkaPrima = true;

            if (i == 0 || i == 1) {
                angkaPrima = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        angkaPrima = false;
                        break;
                    }
                }
            }
            if (angkaPrima) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
