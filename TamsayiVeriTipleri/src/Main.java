
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Değişken dönüştürme işlemleri
		
		byte a = 100;
		
		byte b = (byte) (a / 2);
		
		System.out.println(b);
		
		short i =100;
		byte j = 2;
		int k = 4;
		
		long d = i+j+ k ; 
		// burda java otomatik dönüştürme işlemi yaptı.
		/*nasıl= java soldan sağa doğru değiştirme işlemi yapıyor yani
		i+j ye baktı  i+j işlemini yaptı değeri short a dönüştürdü, 
		sonra i+j + k y baktı orda int e dönüştürdü
		*/
		System.out.println(d);
	}
	
	double a = 5.25 ;
	double b = 4.0;
	double c = 4d;
	
	float d= (float)5.0;
	float e = 5f;
	float i = 5.2f;
	
	double k = 3.52;
	float l = (float)k;
	
	char g= 'a';
	char h = '5';
	char v = 2000; // burda char 2000. karakteri tutuyır, çalıştırınca 2000. karakteri gösterir.
	
	String s= "Merhaba";
	int y = 5;
	String t = s+y ;
	
	String cümle = "Java\tProgramlamam\tDili"; //"\t" bir tab kadar yai 4 tane boşluk bırakır.
	String cümle1 = "Java\nProgramlamam\nDili"; //"\n" n newline demek , bir alt satıra geçmesini sağlıyor.
	
	//MANTIKSAL OPRETÖRLER
	 
	int z = 5;
	/*System.out.println(z++); //5
	System.out.println(++z);   //6
	System.out.println(z--);   //5
	System.out.println(--z);   //4
	
	*/

}
