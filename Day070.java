
import java.util.Scanner;

public class Day070 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = input.nextDouble();
        double gaji = jamKerja * upahPerJam;
        System.out.println("Gaji karyawan adalah: " + gaji);
    }
}
