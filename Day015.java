import java.util.ArrayList;
import java.util.List;

public class Day015 {
    public static void main(String[] args) {
        // List Numerik
        List<Integer> dataAngka = new ArrayList<>();
        dataAngka.add(1);
        dataAngka.add(2);
        dataAngka.add(3);
        dataAngka.add(4);
        dataAngka.add(5);
        System.out.println("List angka: " + dataAngka);

        // List String
        List<String> dataString = new ArrayList<>();
        dataString.add("rara");
        dataString.add("rahma");
        dataString.add("tia");
        System.out.println("List string: " + dataString);

        // List Boolean
        List<Boolean> dataBoolean = new ArrayList<>();
        dataBoolean.add(true);
        dataBoolean.add(false);
        dataBoolean.add(false);
        dataBoolean.add(false);
        dataBoolean.add(true);
        System.out.println("List Boolean: " + dataBoolean);

        // List Angka Ganjil dan Genap Menggunakan For If
        List<Integer> dataGanjil = new ArrayList<>();
        List<Integer> dataGenap = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                dataGanjil.add(i);
            } else {
                dataGenap.add(i);
            }
        }
        System.out.println("List angka ganjil: " + dataGanjil);
        System.out.println("List angka genap: " + dataGenap);
    }
}
