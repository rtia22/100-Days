
import java.util.Scanner;


public class Day095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Volume air / liter : ");
        double volumeAir = sc.nextDouble();
        System.out.print("Masukkan Waktu /jam : ");
        double waktu = sc.nextDouble();

        //mengitung debit air
        double debitAir = volumeAir / waktu;
        System.out.println("Debit air nya adalah " + debitAir + " liter/jam.");
    }
}
