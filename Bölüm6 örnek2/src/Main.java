import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in);
		int sayi = scanner.nextInt();
		System.out.println("basamak sayısı: ");
		int basamakSayisi= scanner.nextInt();
		
		int gecici_sayi = sayi;
		int toplam =0;
		
		do {
			int basamak_degeri = gecici_sayi %10;
			gecici_sayi = gecici_sayi / 10;
			System.out.println("gecici_sayi:"+ gecici_sayi);
			toplam = (int) (toplam + Math.pow(basamak_degeri, basamakSayisi));
		}while(gecici_sayi>0);
		
		if(sayi == toplam) {
			System.out.println("bu sayı bir armstrong sayıdır");
		}
		else {
			System.out.println("bu sayı bir armstrong sayı değildir!");
		}
	}
	

}
