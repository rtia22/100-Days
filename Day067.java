import java.util.Scanner;

public class Day067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            // Tampilkan menu
            System.out.println("Menu:");
            System.out.println("1. Pilihan 1");
            System.out.println("2. Pilihan 2");
            System.out.println("3. Keluar");

            System.out.print("Pilih opsi (1-3): ");
            pilihan = scanner.nextInt();

            // Proses pilihan pengguna
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Pilihan 1");
                    break;
                case 2:
                    System.out.println("Anda memilih Pilihan 2");
                    break;
                case 3:
                    System.out.println("Program berakhir. Selamat tinggal!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

            // Pergi ke baris baru
            System.out.println();
        } while (pilihan != 3);

        // Tutup scanner
        scanner.close();
    }
}
