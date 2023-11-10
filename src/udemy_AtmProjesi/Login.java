package udemy_AtmProjesi;

import java.util.Scanner;

public class Login {
	public void login(Hesap hesap1) { //HESAP1 ÝSÝMLÝ OBJE GÖNDERDÝK
		Scanner scan = new Scanner(System.in);
		String kullanýcý_Adý;
		String parolaa;
		System.out.println("Ziraat Bankasýna Hoþgeldiniz...:)");
		System.out.print("Kullanýcý adýný giriniz: ");
		kullanýcý_Adý=scan.nextLine();
		System.out.print("Parola'yý giriniz: ");
		parolaa=scan.nextLine();
		
		if(hesap1.getKullanýcýAdý().equals(kullanýcý_Adý)&& (hesap1.getParola().equals(parolaa))) {
			System.out.println("Giriþ Yaptnýz...");
			while(true) {
				 System.out.println("Yapmak istediðiniz iþlemi seçiniz:");
					System.out.println("1-Para yatýrma");
					System.out.println("2-Para çekme");
					int secim = scan.nextInt();
					switch(secim) {
					case 1:
						hesap1.paraYatýrma(100.0);
						System.out.println("Yeni bakiye: "+ hesap1.getBakiye());
						break;
					case 2:
						hesap1.paraCekme(300.0);
						System.out.println("Kalan bakiye: "+ hesap1.getBakiye());
						break;
					}
			}
		   
		}else {
			System.out.println("Girdiðiniz bilgileri kontrol ediniz...");
		}
	
	    
		
	}

}
