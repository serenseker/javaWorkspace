
public class Test {

	public static void main(String[] args) {
		

		/*Account account1 = new Account();
		
		account1.setHesapNo("123456");
		account1.setBakiye(1000.0);
		account1.setIsim("seren");
		account1.setEmail("asb@gmail.com");
		account1.setTelefonNo("356486");
		
		System.out.println("bakiye: "+ account1.getBakiye());
		*/
		// *Account account1 = new Account(); dediğimizd javanın default constructer i çalışıyor.
		
		
		//Account account1 = new Account();
		
		// hepsine account 1 deki gibi tektek değer yazmak yerine contructer ile değer verebiliyoruz.
		Account account2 = new Account("1235666 ", 1000.0 , "seren","asb@gmail", "56248792");
	
		account2.paraYatır(500);
		account2.paraCekme(300);
	
	}

}
