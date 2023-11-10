package udemy_AtmProjesi;

import java.util.Scanner;

public class Login {
	public void login(Hesap hesap1) { //HESAP1 �S�ML� OBJE G�NDERD�K
		Scanner scan = new Scanner(System.in);
		String kullan�c�_Ad�;
		String parolaa;
		System.out.println("Ziraat Bankas�na Ho�geldiniz...:)");
		System.out.print("Kullan�c� ad�n� giriniz: ");
		kullan�c�_Ad�=scan.nextLine();
		System.out.print("Parola'y� giriniz: ");
		parolaa=scan.nextLine();
		
		if(hesap1.getKullan�c�Ad�().equals(kullan�c�_Ad�)&& (hesap1.getParola().equals(parolaa))) {
			System.out.println("Giri� Yaptn�z...");
			while(true) {
				 System.out.println("Yapmak istedi�iniz i�lemi se�iniz:");
					System.out.println("1-Para yat�rma");
					System.out.println("2-Para �ekme");
					int secim = scan.nextInt();
					switch(secim) {
					case 1:
						hesap1.paraYat�rma(100.0);
						System.out.println("Yeni bakiye: "+ hesap1.getBakiye());
						break;
					case 2:
						hesap1.paraCekme(300.0);
						System.out.println("Kalan bakiye: "+ hesap1.getBakiye());
						break;
					}
			}
		   
		}else {
			System.out.println("Girdi�iniz bilgileri kontrol ediniz...");
		}
	
	    
		
	}

}
