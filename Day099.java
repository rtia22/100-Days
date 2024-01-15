import java.util.Scanner;

public class Day099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        double[] nilaiMataKuliah = new double[jumlahMataKuliah];
        double[] sksMataKuliah = new double[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nilai mata kuliah " + (i + 1) + " (0-100): ");
            nilaiMataKuliah[i] = scanner.nextDouble();

            System.out.print("Masukkan bobot SKS mata kuliah " + (i + 1) + ": ");
            sksMataKuliah[i] = scanner.nextDouble();
        }

        // Menghitung SKS Terbobot untuk setiap mata kuliah
        double totalSKSTerbobot = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            // Konversi nilai ke IPK
            double ipkMataKuliah = konversiNilaiKeIPK(nilaiMataKuliah[i]);
            totalSKSTerbobot += ipkMataKuliah * sksMataKuliah[i];
        }

        double totalSKS = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalSKS += sksMataKuliah[i];
        }

        double ipk = totalSKSTerbobot / totalSKS;
        System.out.println("IPK: " + ipk);

        scanner.close();
    }

    private static double konversiNilaiKeIPK(double nilai) {
        if (nilai >= 0 && nilai <= 59) {
            return 0.0;
        } else if (nilai >= 60 && nilai <= 69) {
            return 1.0;
        } else if (nilai >= 70 && nilai <= 79) {
            return 2.0;
        } else if (nilai >= 80 && nilai <= 89) {
            return 3.0;
        } else if (nilai >= 90 && nilai <= 100) {
            return 4.0;
        } else {
            // Handle nilai di luar rentang valid (0-100)
            System.out.println("Nilai tidak valid. Gunakan nilai antara 0 dan 100.");
            return 0.0;
        }
    }
}
