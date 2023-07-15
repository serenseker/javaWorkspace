import java.util.Scanner;

public class Main {

	public static void selamlama() {
		System.out.println("Merhaba nasılsınız?");
		System.out.println("selamlar");
	}
	public static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int sayi = scan.nextInt();
		 int faktoriyel = 1;
		
		for(int i = 1 ; i<=sayi ; i++) {
			faktoriyel = i*faktoriyel;
		}
		System.out.println("faktöriyel : "+faktoriyel);
		
		
		
	}
	
	public static void main(String[] args) {
		/*
		 Erişim_Belirleyici(Opsiyone) Extra_Özellikler(static,final vs.) Dönüş_Tipi Fonksiyon_Adı( Parametreler){
		 	//Burası Fonksiyon Bloğu
		 	 
		 	 //Fonksiyonun yapacağı işlemler burada olacak
		   */
		selamlama();
		faktoriyel();
	}

}
