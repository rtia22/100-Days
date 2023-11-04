import java.util.Scanner;

public class Day027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi atas trapesium: ");
        double a = input.nextDouble();

        System.out.println("Masukkan panjang sisi bawah trapesium: ");
        double b = input.nextDouble();

        System.out.println("Masukkan tinggi trapesium: ");
        double h = input.nextDouble();

        // Hitung luas trapesium
        double luas = (a + b) * h / 2;

        System.out.println("Luas trapesium adalah: " + luas);

        input.close();
    }
}
