package org.d3ifcool.ima05;
import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//Variabel(nama hari H, bilangan bulat N, nama hari setelah ditambah N
		Scanner input = new Scanner (System.in);
		int namaHari= 0;
		
		String harinya = input.nextLine();
		switch (harinya) {
			case "Minggu" :
				namaHari = 0;
				break;
			case "Senin" :
				namaHari = 1;
				break;
			case "Selasa" :
				namaHari = 2;
				break;
			case "Rabu" :
				namaHari = 3;
				break;
			case "Kamis" :
				namaHari = 4;
				break;
			case "Jum'at" :
				namaHari = 5;
				break;
			case "Sabtu" :
				namaHari = 6;
				break;
		}
		
		int bilanganBulat = input.nextInt();
		
		int masaDepan = (namaHari + bilanganBulat)%7;
		switch(masaDepan){
			case 1:
				System.out.println("Senin");
				break;
			case 2:
				System.out.println("Selasa");
				break;
			case 3:
				System.out.println("Rabu");
				break;
			case 4:
				System.out.println("Kamis");
				break;
			case 5:
				System.out.println("Jum'at");
				break;
			case 6:
				System.out.println("Sabtu");
				break;
			case 7:
				System.out.println("Minggu");
				break;
		}
	}
}
