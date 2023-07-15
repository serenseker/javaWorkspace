import java.util.Scanner;

public class Main {

	public static int cikarma(int a, int b) {
		return (a-b);
	}
	public static double bolme(int a, int b) {
		return (a/b);
	}
	public static int toplama(int a, int b, int c) {
		return (a+b+c);
	}
	public static int toplama(int a, int b) {
		return (a+b);
	}
	public static int carpma(int a, int b, int c) {
		return (a*b*c);
	}
	public static int carpma(int a,int b) {
		return (a*b);
	}
	public static void main(String[] args) {
		// Method overloading kullanarak bir tane hesap makinesi yapmaya çalışın.
		//Toplama ve Çarpma motodlarını 2 veya 3 parametre alacak şekilde tasarlayın.
		Scanner scan = new Scanner(System.in);
		String islemler= "1. toplama\n"
				+"2.çıkarma\n"
				+"3.çarpma\n"
				+"4.bölme\n"
				+"çıkış yapmak için q a basın";

		System.out.println("-----------------------");
		System.out.println(islemler);
		System.out.println("------------------------");

		while(true) {
		System.out.println("İŞLEM SEÇİNİZ");
		String islem = scan.nextLine();

		if(islem.equals("q")) {
			System.out.println("Sistemden çıkış yapılıyor");
			break;
		}else if (islem.equals(1)) {
			System.out.println("kaç sayı toplayacaksınız 2 veya 3");
			int kacSayi =scan.nextInt();

			if (kacSayi==2) {
				System.out.println("a:");
				int a = scan.nextInt();	
				System.out.println("b:");
				int b = scan.nextInt();

				System.out.println("iki sayının toplamı : "+toplama(a,b));
			}else if (kacSayi==3) {
				System.out.println("a:");
				int a = scan.nextInt();	
				System.out.println("b:");
				int b = scan.nextInt();
				System.out.println("c:");
				int c = scan.nextInt();

				System.out.println("iki sayının toplamı : "+toplama(a,b,c));
			}else {
				System.out.println("geçersiz işlem");
			}
		}else if(islem.equals(2)) {
			System.out.println("a:");
			int a = scan.nextInt();	
			System.out.println("b:");
			int b = scan.nextInt();

			System.out.println("iki sayının toplamı : "+cikarma(a,b));
		}else if (islem.equals(3)) {
			System.out.println("kaç sayı çarpacaksınız 2 veya 3");
			int kacSayi =scan.nextInt();

			if (kacSayi==2) {
				System.out.println("a:");
				int a = scan.nextInt();	
				System.out.println("b:");
				int b = scan.nextInt();

				System.out.println("iki sayının çarpımı : "+toplama(a,b));
			}else if (kacSayi==3) {
				System.out.println("a:");
				int a = scan.nextInt();	
				System.out.println("b:");
				int b = scan.nextInt();
				System.out.println("c:");
				int c = scan.nextInt();

				System.out.println("iki sayının çarpımı : "+toplama(a,b,c));
			}else {
				System.out.println("geçersiz işlem");
			}
		}else if(islem.equals(4)) {
			System.out.println("a:");
			int a = scan.nextInt();	
			System.out.println("b:");
			int b = scan.nextInt();

			System.out.println("iki sayının toplamı : "+bolme(a,b));
		}else {
			System.out.println("geçersiz tışa bastınız");
		}
	}
}
}