
public class Day065 {

    public static void main(String[] args) {
        // Loop dari A (kode ASCII 65) sampai Z (kode ASCII 90)
        for (int i = 65; i <= 90; i++) {
            // Mengonversi kode ASCII ke karakter
            char alphabet = (char) i;
            // Menampilkan karakter
            System.out.print(alphabet + " ");
        }
        System.out.println("manampilkan sebaliknya");
        for (int i = 90; i >= 65; i--) {
            char alphabet = (char) i;
            System.out.print(alphabet + " ");
        }
    }
}
