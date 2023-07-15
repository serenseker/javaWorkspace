package switchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			int islem = scan.nextInt();
			
			switch (islem) {
				case 1:
					System.out.println("1. işlem");
					break;
				case 2:
					System.out.println("2. işlem");
				break;
				case 3:
					System.out.println("3. işlem");
					break;
				default:
					System.out.println("GEÇERSİZ işlem");
					break;

			}
		}
			
	}

}
