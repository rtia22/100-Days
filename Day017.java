import java.util.Scanner;
public class Day17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan tahun kelahiran mu: ");
		int tahun_lahir = sc.nextInt();
		System.out.print("Sekarang tahun berapa?: ");
		int tahun_sekarang = sc.nextInt();
		int umur;
		
		umur = (tahun_sekarang - tahun_lahir);
		System.out.println("Umur kamu sekarang adalah "+umur+" tahun");
		
		if (umur > 25) {
			System.out.println("Pasti sering di tanya kapan nikah? wkwkw");
			System.out.println("Sabar yaww:)");
		}
		
		else {
			System.out.println("Masih comel - comel kayak kunti bogel kemasan saset :* ");
			
		}	
		
	}
}