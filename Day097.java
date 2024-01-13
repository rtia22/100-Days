
import java.util.Scanner;

public class Day097 {

    public static void main(String[] args) {
        // Jumlah pekerja awal dan jumlah hari untuk pekerjaan selesai
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pekerja awal : ");
        int jumlahPekerjaAwal = sc.nextInt();
        System.out.print("Masukkan jumlah hari pengerjaan : ");
        int hariAwal = sc.nextInt();

        // Jumlah pekerja setelah berubah dan waktu yang ingin dihitung
        System.out.print("Masukkan jumlah pekerja setelahnya : ");
        int jumlahPekerjaSetelah = sc.nextInt();

        // Menghitung waktu yang dibutuhkan oleh jumlah pekerja setelah
        int hariSetelah = (jumlahPekerjaAwal * hariAwal) / jumlahPekerjaSetelah;

        // Menampilkan hasil
        System.out.print("Jumlah hari pengerjaan setelahnya : " + hariSetelah);
    }
}
