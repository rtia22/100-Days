import java.util.Scanner;

public class Day047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih jenis umur (bulan/tahun): ");
        String jenisUmur = sc.nextLine();

        if (jenisUmur.equalsIgnoreCase("bulan")) {
            System.out.println("Masukkan Usia 1-12 Bulan : ");
            double bulan = sc.nextInt();

            if (bulan >= 1 && bulan <= 12) {
                double umur = (bulan + 9) / 2;
                System.out.println("Berat badan ideal untuk anak usia " + bulan + " bulan adalah " + umur + " Kg.");
            } else {
                System.out.println("Input bulan tidak valid.");
            }
        } else if (jenisUmur.equalsIgnoreCase("tahun")) {
            System.out.println("Massukkan Usia 1-12 tahun : ");
            double tahun = sc.nextInt();

            if (tahun >= 1 && tahun <= 6) {
                double umur = (tahun * 2) + 8;
                System.out.println("Berat badan ideal untuk anak usia " + tahun + " tahun adalah " + umur + " Kg.");
            } else if (tahun >= 7 && tahun <= 12) {
                double umur = (tahun * 7 - 5) / 2;
                System.out.println("Berat badan ideal untuk anak usia " + tahun + " tahun adalah " + umur + " Kg.");
            } else {
                System.out.println("Input tahun tidak valid.");
            }
        } else {
            System.out.println("Jenis umur tidak valid. Pilih 'bulan' atau 'tahun'.");
        }
    }
}
