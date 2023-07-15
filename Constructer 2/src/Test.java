
public class Test {

	public static void main(String[] args) {
		
		
		Account account1 = new Account();
		
		System.out.println(account1.getEmail());
		
		Account account2 = new Account("Seren","asb@gmail","213245354");
		
		System.out.println(account2.getEmail());
		System.out.println(account2.getBakiye());

		
		account2.bilgilerigöster();
	}

}
