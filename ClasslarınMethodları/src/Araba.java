
public class Araba {

	private String renk;
	private int kapılar;
	private int tekerlekler;
	private String motor;
	private String model;
	
	
	public void setModel (String model) {
		this.model = model;
	}
	public String getModel () {
		return this.model;
	}
	public void setKapılar(int kapılar) {
		if(kapılar<0) {
			System.out.print("kapı değeri 0 da küçük olamaz");
		}else {
			this.kapılar = kapılar;
		}
		
	}
	public int getKapılar() {
		return this.kapılar;
	}
	
}
