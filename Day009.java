
public class Day009 {

    public static void main(String[] args) {
        int n = 10; // Jumlah angka dalam deret
        int sukuPertama = 2; // Suku pertama dalam deret
        int selisih = 3; // Selisih antara setiap dua suku

        System.out.println("Deret aritmatika dengan " + n + " angka:");
        int i = 1;
        while (i <= n) {
            int suku_ke_i = sukuPertama + (i - 1) * selisih;
            System.out.print(suku_ke_i + " ");
            i++;
        }
    }
}
