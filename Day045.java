import java.util.Scanner;

public class Day045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang Sisi Kubus: ");
        int sisi = sc.nextInt();

        int luasPermukaan = 6 * (sisi * sisi);
        int volume = sisi * sisi * sisi;

        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        System.out.println("Volume Kubus: " + volume);

        sc.close();
    }
}
