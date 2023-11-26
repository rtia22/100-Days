import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        // Hitung volume bola
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        System.out.println("Volume bola: " + volume);

        // Hitung keliling bola
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling bola: " + keliling);

        input.close();
    }
}
