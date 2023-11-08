
public class Day031 {

    public static void main(String[] args) {
        int jmlTemu = 16;
        int temuSls = 8;

        for (int temuAwal = 1; temuAwal <= jmlTemu; temuAwal++) {
            if (temuAwal == 5 && temuAwal == 14) {
                System.out.println("pertemuan ke-" + temuAwal + " Diadakan Quis");
            } else if (temuAwal == 8) {
                System.out.println("pertemuan ke-" + temuAwal + " Diadakan UTS");
            } else if (temuAwal == 16) {
                System.out.println("pertemuan ke-" + temuAwal + " Diadakan UAS");
            } else if (temuAwal <= temuSls) {
                System.out.println("pertemuan ke-" + temuAwal + " Telah Selesai");
            } else {
                System.out.println("Pertemuan ke-" + temuAwal + " Blum Selsai");
            }
        }

    }
}
