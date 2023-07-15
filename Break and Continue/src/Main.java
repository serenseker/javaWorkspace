import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		/*BREAK : herhangi bir yerde ve herhangi bir zamanda break ifadesiye karşılaşıldığı zaman 
		çalışmasını durdurur.
		Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
		Break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır.Eğer iç içe döngüler 
		varsa ve içteki döngüde break kullanılmışsa sadece içeteki döngü sona erer.
		
		CONTINUE ANAHTAR KELİMESİ:
		 Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiye karşılaştığı zaman
		 geri kalan işlemleri yapmadan direk döngü bloğunun başına döner.
	*/
	/*	int i = 0;
		
		while(i<20) {
			if(i ==10) {
				break;
			}
			System.out.println("i: "+i);
			i++;
		}
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int islem = scan.nextInt();
			if(islem ==-1) {
				System.out.print("işlem :" + islem + "döngüden çıkılıyor");
				break;
			}
			System.out.println("işlem : "+ islem);
		}
		*/
		
		//continue örnek
		
		for (int i = 0; i<10 ; i++){
			if(i ==3 || i == 5) {
				continue;
			}
			System.out.println("i: "+i);
		}
		
		int a = 0;
		
		while (a<10) {
			if ( a == 3 || a== 5) {
				a++; // by-urda a yi tekrar arttırdık çünkü artırmadığımızda sonsuz döngüye giriyor.
				continue;
			}
			System.out.println("a: "+ a);
			a++;
		}
		
	
	
	}

}
