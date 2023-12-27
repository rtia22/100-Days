
import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        
        double nilaiTukarUSDToIDR = 15000;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah Rupiah (IDR) yang akan dikonversi: ");
        double jumlahRupiah = scanner.nextDouble();

        double jumlahDollar = jumlahRupiah / nilaiTukarUSDToIDR;

        System.out.println(jumlahRupiah + " Rupiah setara dengan " + jumlahDollar + " Dollar.");
    
    }
}
