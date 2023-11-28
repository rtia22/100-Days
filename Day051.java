import java.util.Scanner;

public class Day051 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kecepatan awal (v0): ");
        double v0 = scanner.nextDouble();

        System.out.print("Masukkan kecepatan akhir (v): ");
        double v = scanner.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double t = scanner.nextDouble();

        // Menghitung percepatan menggunakan rumus 
        double percepatan = (v - v0) / t;
        System.out.println("Percepatan : " + percepatan + " m/s^2");

        scanner.close();
    }
}
