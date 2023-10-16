
import java.util.Scanner;

public class Day008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin diinput: ");
        int jumlahAngka = scanner.nextInt();

        int[] angka = new int[jumlahAngka];

        System.out.println("Masukkan angka-angka tersebut:");

        for (int i = 0; i < jumlahAngka; i++) {
            angka[i] = scanner.nextInt();
        }

        int jumlah = 0;
        for (int angkaSatuan : angka) {
            jumlah += angkaSatuan;
        }

        System.out.println("Jumlah dari angka-angka yang diinput adalah: " + jumlah);

        scanner.close();
    }
}
