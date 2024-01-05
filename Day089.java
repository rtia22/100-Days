
import java.util.Scanner;

public class Day089 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);

    }
}
