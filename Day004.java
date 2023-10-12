import java.util.Scanner;

public class Day004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Konversi Celsius ==========");
        System.out.print("Masukkan Besar Suhu (°C): ");
        double celsius = scanner.nextDouble();

        System.out.println("========== Hasil Konversi ==========");
        System.out.println("Suhu Awal = " + celsius + "°C");

        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        double reaumur = (4.0 / 5.0) * celsius;
        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit = " + fahrenheit + "°F");
        System.out.println("Reaumur = " + reaumur + "°R");
        System.out.println("Kelvin = " + kelvin + "K");

        System.out.println("\n========== Konversi Fahrenheit ==========");
        System.out.print("Masukkan Besar Suhu (°F): ");
        double fahrenheitInput = scanner.nextDouble();

        System.out.println("========== Hasil Konversi ==========");
        System.out.println("Suhu Awal = " + fahrenheitInput + "°F");

        double celsiusOutput = (5.0 / 9.0) * (fahrenheitInput - 32);
        double reaumurOutput = (4.0 / 9.0) * (fahrenheitInput - 32);
        double kelvinOutput = (fahrenheitInput - 32) * (5.0 / 9.0) + 273.15;

        System.out.println("Celsius = " + celsiusOutput + "°C");
        System.out.println("Reaumur = " + reaumurOutput + "°R");
        System.out.println("Kelvin = " + kelvinOutput + "K");

        System.out.println("\n========== Konversi Reamur ==========");
        System.out.print("Masukkan Besar Suhu (°R): ");
        double reaumurInput = scanner.nextDouble();

        System.out.println("========== Hasil Konversi ==========");
        System.out.println("Suhu Awal = " + reaumurInput + "°R");

        double celsiusResult = (5.0 / 4.0) * reaumurInput;
        double fahrenheitResult = (9.0 / 4.0) * reaumurInput + 32;
        double kelvinResult = (5.0 / 4.0) * reaumurInput + 273.15;

        System.out.println("Celsius = " + celsiusResult + "°C");
        System.out.println("Fahrenheit = " + fahrenheitResult + "°F");
        System.out.println("Kelvin = " + kelvinResult + "K");

        System.out.println("\n========== Konversi Kelvin ==========");
        System.out.print("Masukkan Besar Suhu (K): ");
        double kelvinInput = scanner.nextDouble();

        System.out.println("========== Hasil Konversi ==========");
        System.out.println("Suhu Awal = " + kelvinInput + "K");

        double celsiusOutputK = kelvinInput - 273.15;
        double fahrenheitOutputK = (9.0 / 5.0) * (kelvinInput - 273.15) + 32;
        double reaumurOutputK = (4.0 / 5.0) * (kelvinInput - 273.15);

        System.out.println("Celsius = " + celsiusOutputK + "°C");
        System.out.println("Fahrenheit = " + fahrenheitOutputK + "°F");
        System.out.println("Reaumur = " + reaumurOutputK + "°R");

        scanner.close();
    }
}
