package org.d3ifcool.ima05;
import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner (System.in);
		String bangunDatar = input.nextLine();
		double pi = 3.14;
		
		switch(bangunDatar){
			case "Persegi":
				int sisi = input.nextInt();
				int luasPersegi = sisi*sisi;
				int kelilingPersegi = 4*sisi;
				System.out.println(luasPersegi + " " +kelilingPersegi);
				break;
			case "Persegi Panjang":
				int panjang = input.nextInt();
				int lebar = input.nextInt();
				int luasPersegiPanjang = panjang*lebar;
				int kelilingPersegiPanjang = 2*panjang + 2*lebar;
				System.out.println(luasPersegiPanjang + " " +kelilingPersegiPanjang);
				break;	
			case "Segitiga":
				int alas = input.nextInt();
				int tinggi = input.nextInt();
				double miring = Math.sqrt((alas*alas) + (tinggi*tinggi));
				int miringBulat = (int)miring;
				int luasSegitiga = (alas*tinggi)/2;
				int kelilingSegitiga = alas + tinggi + miringBulat;
				System.out.println(luasSegitiga + " " +kelilingSegitiga);
				break;
			case "Lingkaran":
				int diameter = input.nextInt();
				int jari_jari = diameter/2;
				double luasLingkaran = pi*jari_jari*jari_jari;
				double kelilingLingkaran = pi*diameter;
				System.out.println(luasLingkaran + " " +kelilingLingkaran);
				break;
		}
	}
}