
public class Day092 {

    public static void main(String[] args) {
        // Contoh penggunaan String.valueOf
        int angka = 42;
        String nilaiString = String.valueOf(angka);
        System.out.println("String dari angka: " + nilaiString);

        // Contoh penggunaan Integer.valueOf
        String stringAngka = "123";
        int hasilKonversi = Integer.valueOf(stringAngka);
        System.out.println("Hasil konversi dari string ke angka: " + hasilKonversi);

        // Contoh penggunaan Double.valueOf
        String stringDouble = "3.14";
        double hasilKonversiDouble = Double.valueOf(stringDouble);
        System.out.println("Hasil konversi dari string ke double: " + hasilKonversiDouble);
    }
}
