import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		//WHİLE DÖNGÜSÜ YARDIMIYLA BİR KULLANICI GİRİŞİ YAZMAYA ÇALIŞIN
		
		Scanner scan = new Scanner(System.in);
		
		int giris_hakki= 3;
		
		String kullanici_ad= "seren şeker";
		String kullanici_parola= "012345";
		
		System.out.println("--------------------");
		System.out.println("Kullanıcı girişine hoşgeldiniz");
		System.out.println("--------------------");
		
		
		while(true) {
			
			System.out.println("kullanıcı giriniz:");
			String kullanici= scan.nextLine();
			System.out.println("parola giriniz:");
			String parola= scan.nextLine();
			
			if(kullanici_ad.equals(kullanici) && kullanici_parola.equals(parola)) {
				System.out.println("Hoşgeldiniz : "+ kullanici);
				break;
				
			}else if(kullanici_ad.equals(kullanici) && !kullanici_parola.equals(parola)) {
				System.out.println("parola yanlış ");
				giris_hakki -= 1;
				System.out.print("giriş hakkı:" +giris_hakki);
			}
			
			else if(!kullanici_ad.equals(kullanici) && kullanici_parola.equals(parola)) {
				System.out.println("kullanıcı adı yanlış ");
				giris_hakki -= 1;
				System.out.println("giriş hakkı:" +giris_hakki);
			}
			
			else {
				System.out.println("kullanıcı adı ve parola yanlış ");
				giris_hakki -= 1;
				System.out.println("giriş hakkı:" +giris_hakki);
			}
			if(giris_hakki == 0 ) {
				System.out.println("giriş hakkınız doldu, tekrar bekleriz.");
				break;
			}
		}
	}

}
