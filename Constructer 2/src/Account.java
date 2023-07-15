
public class Account {
	
	private String hesapNo;
	double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	
	public Account() {
		/*this.hesapNo = "Bilgi yok";
		this.bakiye = 0.0;
		this.isim = "Bilgi yok";
		this.email = "biilgi yok";
		this.telefonNo = "Bilgi yok ";
		*/
		
		this("bilgi yok", 0.0 , "Bilgi yok","Bilgi yok","Bilgi yok");
      // dediğimizde bu contructer içerisinde aşağıda i constructeri çağırmış olacağız
		//Ve bu constucterimiz içerinde varsayılan değerlerimiz atanmış olacak.
	}
	public Account(String isim ,String email, String telefonNo) {
		/*this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		
		this.hesapNo = "Bilgi yok";
		this.bakiye = 0.0;
		*/
		
		this("Bilgi yok", 0.0, isim,email, telefonNo);
		
	}
	public Account(String hesapNo , double bakiye , String isim , String email ,String telefonNo) {
		this.hesapNo = hesapNo;
		this.bakiye= bakiye;
		this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
	}
	public void bilgilerigöster() {
		System.out.println("hesap no:" + this.hesapNo);
		System.out.println("bakiye : "+ this.bakiye);
		System.out.println("isim : "+ this.isim);
		System.out.println("email : "+ this.email);
		System.out.println("telefon n : "+ this.telefonNo);
	}
	public void paraYatır(double miktar) {
		bakiye += miktar;
		System.out.println("yeni bakiye: "+ bakiye);
	}
	public void paraCekme(double miktar) {
		if(miktar>1500) {
			System.out.println("bir gün içinde max 1500 çekebilirsinzi.");
		}
		if(bakiye- miktar <0) {
			System.out.println("bakiye yetersiz: "+ bakiye);
		}else {
			bakiye -= miktar;
			System.out.println("yeni bakiyeniz : "+ bakiye);
		}
	}
	
	
	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}


}
