import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		/*Faiz uygulması
		Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
		bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
		Faiz oranı : %6 faizli
	*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bankamıza hoşgeldiniz faiz oranı %6");
		int anaPara, vade;
		System.out.println("Yatırmak istediğiniz ana para tutarı: ");
		anaPara= scan.nextInt();
		System.out.println("Kaç yıl vadeyle yatırmak istersiniz? : ");
		vade = scan.nextInt();
		
		 double toplamPara=  anaPara;
		 double faizOranı= 0.06;
		 
		 for( int i = 1; i<=vade ; i++) {
			 toplamPara =  toplamPara * faizOranı + toplamPara;
			 System.out.println(i + ". yılın sonunda toplam para : "+ (int)toplamPara);
		 }
		 
		
		
		
		
		
		
	}

}
