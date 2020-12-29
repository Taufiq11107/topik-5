package org.d3ifcool.ima05;
import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		int bilanganBulatA;
		int bilanganBulatB;
		char operator;
		
		bilanganBulatA = input.nextInt();
		operator = input.next().charAt(0);
		bilanganBulatB = input.nextInt();
		float aa = new Float(bilanganBulatA);
		float bb = new Float(bilanganBulatB);
		
		float pembagian =(aa / bb);
		switch(operator)
		{
			case '+':
				System.out.println(bilanganBulatA+bilanganBulatB);
				break;
			case '-':
				System.out.println(bilanganBulatA-bilanganBulatB);
				break;
			case '*':
				System.out.println(bilanganBulatA*bilanganBulatB);
				break;
			case '/':
				System.out.println(pembagian);
				break;
		}		
	}
}
