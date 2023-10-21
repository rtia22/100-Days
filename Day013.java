
public class Day013 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue; // Keluar dari loop jika i adalah 3
            }else if(i == 7){
                break;
            }
            System.out.println("Nilai i: " + i);
        }
    }

}
