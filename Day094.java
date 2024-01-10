
import java.util.Scanner;

public class Day094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Debit air(liter/jam) : ");
        double debitAir = sc.nextDouble();
        System.out.print("Masukkan Waktu /jam : ");
        double waktu = sc.nextDouble();

        //mengitung volume air liter/jam
        double volume = debitAir * waktu;
        System.out.println("Volume air nya adalah " + volume + " liter.");
    }
}
