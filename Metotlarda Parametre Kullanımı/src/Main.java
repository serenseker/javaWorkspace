
public class Main {

	public static void selamlama(String isim) {
		System.out.println("selam  "+ isim);
	}
	
	public static void toplama(int a, int b, int c){
		int toplam = a+b+c;
		System.out.println(toplam);
		System.out.println("toplamları :" + (a+b+c));
	}
	public static void main(String[] args) {
		
		selamlama("seren");
		
		toplama(2,3,5);
	}

}
