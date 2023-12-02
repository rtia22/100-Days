import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day054 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = input.nextInt();

        if (jumlahBilangan <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0");
            System.exit(0);
        }

        int bilangan;
        Set<Integer> setAngka = new HashSet<>();
        Set<Integer> angkaKembar = new HashSet<>();

        System.out.println("Masukkan bilangan-bilangan:");

        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            bilangan = input.nextInt();

            if (!setAngka.add(bilangan)) {
                angkaKembar.add(bilangan);
            }
        }

        if (angkaKembar.isEmpty()) {
            System.out.println("Tidak ada angka kembar.");
        } else {
            System.out.println("Angka kembar yang ditemukan: " + angkaKembar);
        }

        input.close();
    }
}
