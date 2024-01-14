
import java.util.Scanner;

public class Day098 {

    public static void main(String[] args) {
        // Jarak yang sudah ditempuh dan jumlah bensin yang digunakan
        Scanner sc = new Scanner(System.in);
        System.out.print("masuukkan jarak tempuh (km) : ");
        double jarakDitempuh = sc.nextDouble();
        System.out.print("masukkan bensin yang digunakan (liter) : ");
        double bensinDigunakan = sc.nextDouble(); // dalam liter

        // Menghitung jarak yang dapat ditempuh per liter bensin
        double jarakPerLiter = jarakDitempuh / bensinDigunakan;
        System.out.println("jarak yang dapat ditempuh perliternya bensin adalah : " + jarakPerLiter + "km");

        // Jumlah bensin yang dimiliki 
        System.out.print("masukkan jumlah bensin yang dimiliki : ");
        double bensinDimiliki = sc.nextDouble(); // dalam liter

        // Menghitung jarak yang dapat ditempuh 
        double jarakTotal = jarakPerLiter * bensinDimiliki;

        // Menampilkan hasil
        System.out.println("Jarak yang dapat ditempuh adalah: " + jarakTotal + " kilometer");
    }
}
