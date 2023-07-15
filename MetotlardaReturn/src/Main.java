
public class Main {

	public static int ikiiletopla(int i) {
		return i+2;
	}
	public static int dortilecarp (int i) {
		return i*4;
	}
	public static int toplama(int a, int b, int c) {
		return (a+b+c);
	}
	public static int deneme(int a) {
		System.out.println("çıktı veriliyor");
		return a*2;
	}
	public static void main(String[] args) {
		// void fonksiyonu hiçbir şey döndürmeyen fonksiyon anlamına gelir.

		System.out.println("çıktı: "+ toplama(1,2,3));
		
		System.out.println(dortilecarp(ikiiletopla(8)));
		
		System.out.println(deneme(4));
	}
  //return metotlarda son çalışan koddur.altına yazdığımız hiçbir kod çalışmaz!!!!!*********
}
