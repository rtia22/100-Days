import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("masukkan angka : ");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= a ; i++){
			sum+=i;
			System.out.print(i);
			if(i < a){
				System.out.print(" + ");
			}
			
		}
		System.out.print(" = " + sum);
	}
}