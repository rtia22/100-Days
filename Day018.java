import java.util.ArrayList;

public class Day018 {
    public static void main(String[] args) {
        // Deklarasikan ArrayList untuk nama dan umur
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> umur = new ArrayList<>();

        // Tambahkan item ke dalam ArrayList
        nama.add("Rara");
        umur.add(20);

        nama.add("Rahma");
        umur.add(19);

        nama.add("Tia");
        umur.add(21);

        // Cetak nama dan umur
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Nama: " + nama.get(i) + ", Umur: " + umur.get(i));
        }
    }
}
