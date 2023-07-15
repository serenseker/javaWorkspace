
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Araba araba1 = new Araba();
		
		araba1.setModel("renault");
		
		System.out.print("arabanın modeli:" + araba1.getModel());
		
		araba1.setKapılar(10);
		
		/*Araba araba2 ;
		
		araba2.setKapılar(10); // dersen araba 2 referansına , herhangi bir obje atamadığımız için hata verir.
		*/
		
		/*Araba araba3 = null;
		
		araba3.setModel("renault");  // referansa herhangi bir obje atamadan erişmeye çalıştığımız için hata alırız.
	*/
	}

}
