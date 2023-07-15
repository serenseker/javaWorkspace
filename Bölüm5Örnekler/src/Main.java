import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//SORU1: Kullanıcıdan alınan 3 sayının en büyüğünü bulma 
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("3 sayı giriniz");
		
		int sayi1 = scanner.nextInt();
		int sayi2 = scanner.nextInt();
		int sayi3 = scanner.nextInt();	
		
		if(sayi1 >=sayi2 && sayi1 >= sayi3) {
			
			System.out.print("sayi1 en büyüktür : "+ sayi1);
			
		}else if(sayi2 >= sayi3 && sayi2 >= sayi1) {
			
			System.out.print("sayi2 en büyüktür : "+ sayi2);
			
		}else {
			
			System.out.print("sayi3 en büyüktür : "+ sayi3);
		}
		*/
		/*
		//SORU 2 : Kullanıcıdan alınan boy kilo bilgisine göre beden kştle indekxi cvbı verme
		
		Scanner scanner  = new Scanner(System.in);
		
		int kilo = scanner.nextInt();
		double boy = scanner.nextDouble();
		
		double bki = kilo / (boy* boy);
		
		if (bki < 18.5) {
			System.out.println("zayıf");
		} else if (18.5 < bki &&  bki < 25) {
			System.out.println("normal");
		} else if (25 < bki && bki< 30) {
			System.out.println("fazla kilolu");
		} else {
			System.out.println("obez");
		}
		*/
		/*
		//SORU3 :switch case kullanarak bir hesap mak yapmak
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("iki sayı giriniz");
		
		int sayi1 = scanner.nextInt();
		int sayi2 = scanner.nextInt();
		
		int islemNo = scanner.nextInt();
		
		switch (islemNo) {
		case 1:
			System.out.println("toplama : " + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("çıkarma : " + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("çarpma : " + sayi1 * sayi2);
			break;
		case 4:
			System.out.println("bölme : " + sayi1 / sayi2);
			break;
		default:
			System.out.println("yanlış işlem seçiniz");
			break;
		}
		*/
		
		//SORU3:Kullanıcıdan vize vize2, ve final notunu alıp bir harf hesaplama sistei yap.
		//Ayrıca kulanıcıdan okulun genel ort alarak , ortalamsı DD ise ve notu2,5 in altındaysa uyarı mesajı versin tavsiye mesajı veriniz.
		//vize toplam notun %30 una etki edecek,vize2 toplam notun %30 una etki edecek,final toplam notun %30 una etki edecek
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Vize , Vize 2 ve final notunuzu giriniz");
		
		int vize = scanner.nextInt();
		int vize2 = scanner.nextInt();
		int finall = scanner.nextInt();
		
		double ort = (vize*3/10.0)+ (vize2*3/10.0)+ (finall*4/10.0);
		
		double okulOrt = scanner.nextDouble();
		
		if(ort>=90) {
			System.out.println("AA");
		}else if(ort>=70) {
			System.out.println("BB");
		}else if(ort>=55) {
			System.out.println("CC");
		}else if(ort>=50) {
			System.out.println("DD");
			if(ort<2.5) {
				System.out.print("Dersi tekrar almayı düşünebilirsiniz");
			}
		}else{
			System.out.println("FF");
		}
		System.out.println(ort);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
