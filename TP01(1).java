package org.d3ifcool.ima05;
import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini

		Scanner scanner = new Scanner (System.in);
		int bulan = scanner.nextInt();

		switch(bulan){
			case 1:
				System.out.println("janvier");
				break;
			case 2:
				System.out.println("fevrier");
				break;
			case 3:
				System.out.println("mars");
				break;
			case 4:
				System.out.println("avril");
				break;
			case 5:
				System.out.println("mai");
				break;
			case 6:
				System.out.println("juin");
				break;
			case 7:
				System.out.println("juillet");
				break;
			case 8:
				System.out.println("aout");
				break;
			case 9:
				System.out.println("septembre");
				break;
			case 10:
				System.out.println("octobre");
				break;
			case 11:
				System.out.println("novembre");
				break;
			case 12:
				System.out.println("decembre");
				break;
		}
	}
}