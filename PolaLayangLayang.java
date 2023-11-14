import java.util.Scanner;

public class PolaLayangLayang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi layang-layang: ");
        int tinggi = sc.nextInt();

        // Bagian atas layang-layang
        for (int i = 0; i < tinggi; i++) {
            for (int j = tinggi - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bagian bawah layang-layang
        for (int i = 1; i < tinggi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = tinggi - 1; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
