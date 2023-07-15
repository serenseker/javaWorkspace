import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	 //FOR DÖNGÜSÜ
	/*	int i = 0;
		
		for (; i<5 ; i++) {
			System.out.println("java");
		}*/
	/*	
		int a = 0;
		int b = 10;
		
		for( ; a<10 && b>0 ; a++ , b--) {
			System.out.println("a:" + a );
			System.out.println("b:" + b );
		}
		*/
		/*
		//KULLANICIDAN ALDIĞIMIZ BİR SAYININ FAKTÖRİYELİNİ BULMA
		Scanner scan = new Scanner(System.in);
		System.out.println("BİR SAYI GİRİNİZ");
		int sayi = scan.nextInt();
		int fak = 1;
		
		for (int i =1 ; i<= sayi; i++) {
			fak *= i;
		}
		System.out.println("faktöriyl : "+ fak);
		
		*/
		/*------------------------------------------------------------
		//WHİLE DÖNGÜSÜ
		 while(döngü koşulu) {
		 	Koşul doğru olduğu sürece çalışır.
		 	}
	
		
		// 1 den 10 a kadar olan sayılıarı yazdırm a while döngüsü
		
		int i = 10;
		
		while(i<=10) {
			System.out.println("i: " + i);
			i++;
		}
		
		//Faktöriyel hesaplama 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("BİR SAYI GİRİNİZ");
		int sayi = scan.nextInt();
		
		int faktör = 1;
		
		
		while(sayi>=1) {
			faktör *= sayi;
			sayi--;
		}
		
		System.out.println("faktöriyeli: " + faktör);
		
		//Sonsuz döngü örneği 
		
		int a = 0 ;
		
		while ( a <10) {
			System.out.println("a = "+ a);
		}
		
		------------------------------------------------------*/
		/*
		// DO- WHİLE DÖNGÜSÜ
		
		do {
			Koşul doğru olduğu sürece 
			While dan farkı en az bir kez çalışmasının garantisi olması.
		}
		while(koşul);
		
		
		*/
	
		/*int i =0;
		do {
			System.out.println("i:"+i);
			i++;
		}while(i<10);
		*/
		
		//ALINAN SAYININ RAKAMLARI TOPLAMINI BULMA
		
		Scanner scan = new Scanner(System.in);
		System.out.println("BİR SAYI GİRİNİZ");
		int sayi = scan.nextInt();
		int toplam=0;
		
		
		do {
			toplam = toplam + sayi %10 ;
			sayi = sayi/ 10;
			System.out.println("sayi : "+sayi);
		}while(sayi>0);
		System.out.print("toplamı "+ toplam);
		
		
	}

}
