import java.util.Scanner;
import java.util.Random;

public class Day029 {
    public static void main(String[] args) {
        Random random = new Random();
        int angkaRahasia = random.nextInt(100) + 1; // Menghasilkan angka acak antara 1 dan 100
        int kesempatan = 5;

        System.out.println("Tebak Angka Rahasia");
        System.out.println("Kamu memiliki " + kesempatan + " kesempatan");

        Scanner inputScanner = new Scanner(System.in);

        for (int percobaan = 1; percobaan <= kesempatan; percobaan++) {
            System.out.print("\nPercobaan ke-" + percobaan + ": Masukkan angka tebakan: ");
            int tebakan = inputScanner.nextInt();

            if (tebakan == angkaRahasia) {
                System.out.println("Selamat, tebakanmu benar!");
                break;
            } else if (tebakan < angkaRahasia) {
                System.out.println("Tebakanmu terlalu kecil!");
            } else {
                System.out.println("Tebakanmu terlalu besar!");
            }
        }

        inputScanner.close();
        System.out.println("\nAngka rahasia adalah: " + angkaRahasia);
    }
}
