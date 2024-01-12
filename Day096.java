
import java.util.Scanner;

public class Day096 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan volume / liter : ");
        double volumeAir = sc.nextDouble();
        System.out.print("Masukkan Debit air(liter/jam) : ");
        double debitAir = sc.nextDouble();

        //mengitung waktu yang diperlukan
        double waktu = volumeAir / debitAir;
        System.out.println("waktu yang diperlukan mengisi suatu wadah adalah " + waktu + " jam");
    }
}
