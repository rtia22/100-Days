import java.util.ArrayList;
import java.util.Collections;

public class Day016{
    public static void main(String[] args) {
        // Menampilkan Index Data
        ArrayList<String> data = new ArrayList<>();
        data.add("saya");
        data.add("pergi");
        data.add("kuliah");
        data.add("siang hari");
        int lokasi = data.indexOf("kuliah");
        System.out.println("Data \"kuliah\" berada pada index : " + lokasi);

        // Menambah Data
        ArrayList<String> data2 = new ArrayList<>();
        data2.add("diam");
        data2.add("adalah");
        data2.add("emas");
        System.out.println("Data awal : " + data2);
        data2.add("<- itu pepatah ya gess");
        System.out.println("Data di tambah : " + data2);

        // Menghapus Data
        ArrayList<String> data3 = new ArrayList<>();
        data3.add("habis");
        data3.add("manis");
        data3.add("sepah");
        data3.add("dibuang");
        System.out.println("Data Awal : " + data3);
        data3.remove("dibuang");
        System.out.println("Data Setelah di hapus : " + data3);

        // Menyisipkan Data
        ArrayList<String> data4 = new ArrayList<>();
        data4.add("rahma");
        data4.add("tia");
        System.out.println("Data awal : " + data4);
        data4.add(2, "Cantikkkkkk");
        System.out.println("Data setelah insert :" + data4);

        // Mengurutkan Data Terkecil ke Terbesar
        ArrayList<Integer> data5 = new ArrayList<>();
        data5.add(13);
        data5.add(5);
        data5.add(2);
        data5.add(1);
        data5.add(4);
        data5.add(3);
        Collections.sort(data5);
        System.out.println("Data terkecil ke terbesar " + data5);

        // Mengurutkan Data Terbesar ke Terkecil
        ArrayList<Integer> data6 = new ArrayList<>();
        data6.add(3);
        data6.add(6);
        data6.add(8);
        data6.add(7);
        data6.add(9);
        data6.add(10);
        Collections.sort(data6, Collections.reverseOrder());
        System.out.println("Data terbesar ke terkecil " + data6);
    }
}
