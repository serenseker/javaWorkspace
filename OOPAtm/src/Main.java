
public class Main {

	public static void main(String[] args) {
		
		//object oriented nesne yönelimli ATM projesi
		
		//Login Class ı kullanıcı Girişini kontrol edecek
		
		//Hesap class ı hesap işlemleri yapacak
		
		//ATM ise atmmizi çalıştıracak.

		
		ATM atm =new ATM();
		
		Hesap hesap = new Hesap("seren şeker", "12345",2000);
		
		atm.calis(hesap);
		System.out.println("programdan çıkılıyor");
	}

}
