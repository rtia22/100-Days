import java.util.Scanner;

public class Day050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan tinggi pohon cemara: ");
        int tinggi = sc.nextInt();

        for (int i = 0; i < tinggi; i++) {
            // Cetak spasi sebelum bintang
            for (int j = 0; j < tinggi - i - 1; j++) {
                System.out.print(" ");
            }
            // Cetak bintang pertama
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Cetak batang pohon
        for (int i = 0; i < tinggi / 3; i++) {
            for (int j = 0; j < tinggi - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
