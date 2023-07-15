import java.util.Scanner;

public class Main {

	public static int ebobBulma (int sayi1, int sayi2) {
		
		int ebob = 1;
		
		for(int i = 1; i<=sayi1 && i<= sayi2; i++) {
			if(sayi1 %i == 0 && sayi2 % i ==0) {
				ebob = i;
		}
	}
		return ebob;
}	
	public static void main(String[] args) {
		// Kullanıcıdan alınan 2 sayının ebobunu(en büyük ortak bölenlerini) bulma
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("birinci sayıyı giriniz");
		int birinciSayi = scan.nextInt();
		
		System.out.println("iknci sayıyı giriniz");
		int ikinciSayi = scan.nextInt();
		
		System.out.println(ebobBulma(birinciSayi, ikinciSayi));

	}

}
