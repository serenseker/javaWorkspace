
public class Main {

	public static void main(String[] args) {
		//iç içe for döngüsü kullanrak bir çarpım tablosu oluştur.
		
		for(int i= 1; i <11; i++) {
			System.out.println("------------------------");
			for(int j = 1 ; j<11; j++) {
				
				System.out.println(i +  " * "  + +j + " = "+ (i*j));
			}
			System.out.println("------------------------");
		}
		
	}

}
