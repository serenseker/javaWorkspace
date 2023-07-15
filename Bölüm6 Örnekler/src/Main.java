import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//While döngüsü yardımıyla bir ATM programı yapmaya çalışın
	/*
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		String islemler ="1.İşlem : Bakiye Öğrenme\n"
						+"2. işlem : Para çekme \n"
						+"3. işkem : Para yatırma\n"
						+"Çıkış için q' a basın";
		System.out.println("-----------------------");
		System.out.println(islemler);
		System.out.println("---------------------");
		
		while(true) {
			
			System.out.println("işlemi seçiniz");
			String islem = scan.nextLine();
			
			if( islemler.equals("q")) {
				System.out.println("Çıkış yapılıyor");
				break;
			}
			else if(islemler.equals("1")) {
				System.out.println("Bakiyeniz: "+ bakiye);
				
			}
			else if(islemler.equals("2")) {
				System.out.println("çekmek istediğiniz tutar:");
				int tutar = scan.nextInt();
				scan.nextLine(); //int bir değer aldıktan sonra string aldığımız için bu satırı ekledim (istisna durmu idi)
				
				if(bakiye- tutar<0) {
					System.out.println("Bakiye yetersiz"+ bakiye);
				}else {
					bakiye = bakiye - tutar;
					System.out.println(bakiye);
				}
			}
			else if(islemler.equals("3")) {
				System.out.println("yatırmak istediğiniz tutar:");
				int tutar = scan.nextInt();
				scan.nextLine();
				bakiye = bakiye +tutar;
				System.out.println("Yeni tutar: "+ bakiye );
			}
			else {
				System.out.println("Geçersiz işlem seçtiniz");
			}
	}*/

}
}