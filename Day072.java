import java.util.Scanner;

public class Day072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MOHON MASUKKAN DATA DENGAN ANGKA");

        System.out.print("Masukkan Tanggal : ");
        int day = scanner.nextInt();

        System.out.print("Masukkan Bulan : ");
        int bulan = scanner.nextInt();

        System.out.print("Masukkan Tahun : ");
        int tahun = scanner.nextInt();

        int hasil_hari = day - 19;
        int hasil_bulan = bulan - 12;
        int hasil_tahun = tahun - 2023;

        int jmlh = hasil_hari + (hasil_bulan * 30) + (hasil_tahun * 360);

        System.out.printf("Jarak Hari Antara %d-%d-%d dengan 19-12-2023%n", day, bulan, tahun);
        System.out.println("adalah :");
        System.out.println(jmlh + " hari");
    }
}
