import java.util.Scanner;

public class Day076 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0; 
        boolean isSelesai = false; 

        System.out.println("===== PROGRAM KASIR SEDERHANA =====");

        while (!isSelesai) {
            System.out.print("Masukkan harga barang (atau 0 untuk selesai): ");
            int hargaBarang = scanner.nextInt(); 

            if (hargaBarang == 0) {
                isSelesai = true; 
            } else {
                totalHarga += hargaBarang; 
            }
        }

        System.out.println("Total harga yang harus dibayar: " + totalHarga);
    }
}