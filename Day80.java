
import java.util.Scanner;

public class Day80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int luas = sc.nextInt();
        int perMter = 300000;
        long total_harga = luas * perMter;
        if(total_harga >= 50_000_000){
            double pajak = total_harga * 0.03;
            System.out.println("Pajak : " + pajak);
            double jumlah_pajak = total_harga + pajak;
            System.out.println("Jumlah Pembayaran : " + jumlah_pajak);
        }else if(total_harga >= 100_000_000){
            double pajak = total_harga * 0.05;
            System.out.println("Pajak : " + pajak);
            double jumlah_pajak = total_harga + pajak;
            System.out.println("Jumlah Pembayaran : " + jumlah_pajak);
        }else{
            double pajak = total_harga * 0.01;
            System.out.println("Pajak : " + pajak);
            double jumlah_pajak = total_harga + pajak;
            System.out.println("Jumlah Pembayaran : " + jumlah_pajak);
        }
        
    }
}
