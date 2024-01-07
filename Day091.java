
import java.util.Scanner;

public class Day091 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan untuk mencari akar kuadrat: ");
        double angka = scanner.nextDouble();

        if (angka < 0) {
            System.out.println("Tidak dapat menghitung akar kuadrat dari bilangan negatif.");
        } else {
            double akarKuadrat = Math.sqrt(angka);
            System.out.println("Akar kuadrat dari " + angka + " adalah: " + akarKuadrat);
            double akarKubik = Math.cbrt(angka);
            System.out.println("Akar kubik dari " + angka + " adalah: " + akarKubik);
        }
    }
}
