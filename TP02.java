package org.d3ifcool.ima05;
import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini	
		Scanner input = new Scanner (System.in);
		int hari = input.nextInt();
		int hariIni = 5;
		
		int hitung = (hari + hariIni) % 7;
		
		switch(hitung){
			case 0:
				System.out.println("dimanche");
				break;
			case 1:
				System.out.println("lundi");
				break;
			case 2:
				System.out.println("mardi");
				break;
			case 3:
				System.out.println("mercedi");
				break;
			case 4:
				System.out.println("jeudi");
				break;
			case 5:
				System.out.println("vendredi");
				break;
			case 6:
				System.out.println("samedi");
				break;
		}
	}
}