import java.util.Scanner;

public class Login {

	public boolean login(Hesap hesap){
		
		Scanner scanner = new Scanner(System.in);
		String kullanici_adi;
		String parola;
		
		System.out.println("kullanıcı adı : ");
		kullanici_adi = scanner.nextLine();
		
		System.out.println("parola : ");
		parola = scanner.nextLine();
		
		
		if(hesap.getKullanici_adi().equals(kullanici_adi)) {
			return true;
		}else {
			return false;
		}
	}
}
