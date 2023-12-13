import java.util.Scanner;

public class Day066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = scanner.nextLine();

        // Mengonversi setiap karakter dalam kata ke kode ASCII
        System.out.print("Kode ASCII untuk setiap karakter dalam kata adalah: ");
        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            int kodeAscii = (int) karakter;
            System.out.print(kodeAscii + " ");
        }
    }
}
