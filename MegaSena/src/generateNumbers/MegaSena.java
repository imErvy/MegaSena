package generateNumbers;

import java.util.Random;

public class MegaSena {
	public static void main(String[] args) {
		Random generate = new Random();
		
//		int i = 1;
//		while(i <= 6) {
//			int number =  generate.nextInt(60);
//			System.out.println(i + "º Numero: " + number);
//			i++;
//		}
		
		for(int i = 1; i <= 6; i++) {
			int number =  generate.nextInt(60);
			System.out.println(i + "º Numero: " + number);
		}
	}
}
