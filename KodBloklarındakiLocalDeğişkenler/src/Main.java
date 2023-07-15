
public class Main {

	public static void toplama(int a, int b, int c) {
		
		System.out.println("toplam: "+ (a+b+c));
	}
	
	public static void main(String[] args) {
		
		
		/*Değikenler tanımlandığı kod blokları arasında kullanılır ,
		 *  süslü barantezler dişinda kullanılamaz, hata verir
		 * 
		 */
		
		
		toplama(10,20,30);
		//System.out.println(a);// a toplama metodunda tanımlandığı için a nın değerii burda yazdıramam.
		
	}

}
