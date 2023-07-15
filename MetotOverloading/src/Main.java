
public class Main {
	
	public static void skorhesapla(String isim, int puan) {
		
		System.out.println(isim + " adlı oyuncunun "+ puan +" puanı vardır");
		
	}
	public static void skorhesapla( int puan) {
		
		System.out.println("isimsiz oyuncunun "+ puan +" puanı vardır");
		
	}
	public static void skorhesapla(String isim) {
		
		System.out.println(isim + " adlı oyuncunun hiç puanı yoktur.");
	}
	
	/*public static void toplama(String a , String b) {
		
		System.out.println(a + " "+b);
		
	}
	public static void toplama( int a, int b) {
		
		System.out.println("toplam : "+ (a+b));
		
	}
	public static void toplama(int a, int b, int c) {
		
		System.out.println("toplam : "+ (a+b+c));
	}
	*/

	public static void main(String[] args) {
		/* bir metoda metot overloading yaptığımız zaman , o metodu 
		 * birden farklı şekilde kullanabiliyoruz , birden farklı şekilde 
		 * çağırabiliyoruz.
		 * Metot overloading de önmemli olan şey fonksiyonumuzun isminin aynı kalması.
		 * */
		 /*
		toplama(2,3,4);
		toplama(2,5);
		toplama( "seren","şeker");
		*/
		
		
		skorhesapla( "seren", 100);
		skorhesapla("seren");
		skorhesapla(100);
	}

}
