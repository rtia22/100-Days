
import java.util.Scanner;

public class Day77 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih satuan panjang awal:");
        System.out.println("1. Meter");
        System.out.println("2. Kilometer");
        System.out.println("3. Centimeter");
        System.out.println("4. Milimeter");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihanAwal = scanner.nextInt();

        if (pilihanAwal < 1 || pilihanAwal > 4) {
            System.out.println("Pilihan tidak valid. Program berhenti.");
            return;
        }

        System.out.print("Masukkan panjang dalam satuan awal: ");
        double panjangAwal = scanner.nextDouble();

        System.out.println("Pilih satuan panjang tujuan:");
        System.out.println("1. Meter");
        System.out.println("2. Kilometer");
        System.out.println("3. Centimeter");
        System.out.println("4. Milimeter");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihanTujuan = scanner.nextInt();

        if (pilihanTujuan < 1 || pilihanTujuan > 4) {
            System.out.println("Pilihan tidak valid. Program berhenti.");
            return;
        }

        double hasilKonversi = konversiPanjang(panjangAwal, pilihanAwal, pilihanTujuan);

        System.out.println(panjangAwal + " " + satuanToString(pilihanAwal)
                + " setara dengan " + hasilKonversi + " " + satuanToString(pilihanTujuan));
    }

    private static double konversiPanjang(double panjangAwal, int pilihanAwal, int pilihanTujuan) {

        double faktorAwal = getFaktorKonversi(pilihanAwal);

        double faktorTujuan = getFaktorKonversi(pilihanTujuan);

        return panjangAwal * faktorAwal / faktorTujuan;
    }

    private static double getFaktorKonversi(int pilihan) {
        switch (pilihan) {
            case 1: // Meter
                return 1.0;
            case 2: // Kilometer
                return 1000.0;
            case 3: // Centimeter
                return 0.01;
            case 4: // Milimeter
                return 0.001;
            default:
                return 1.0;
        }
    }

    private static String satuanToString(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Meter";
            case 2:
                return "Kilometer";
            case 3:
                return "Centimeter";
            case 4:
                return "Milimeter";
            default:
                return "";
        }
    }
}
