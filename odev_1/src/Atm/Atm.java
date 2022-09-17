package Atm;

import java.util.Scanner;

public class Atm {

	public void work(Account erdem){
		
		Login log=new Login();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("************************");
		System.out.println("Bankamiza Hosgeldiniz");
		System.out.println("************************");
		
		System.out.println("Kullanici girisi");
		System.out.println("*******************");
		
		int giris_hakkı=3;
		
		while(true) {
			if(log.login(erdem)) {
				System.out.println("Giris Başarili...");
				break;
			}
			else {
				System.out.println("Giris Başarisiz..");
				giris_hakkı -=1;
				System.out.println("kalan giris hakki:"+giris_hakkı);
			}
			if(giris_hakkı==0) {
				System.out.println("Giris hakkiniz bitti");
				
				return;
			}
		}
		
		System.out.println("******************************");
		
		String islemler="1.islem : Bakiye ogrenme \n"+"2.islem : Para yatirma \n"+"3.islem : Para cekme \n"+"cikis icin ' q ' harfine basin \n";
		System.out.println("***********************************");
		 System.out.print(islemler);
		 System.out.println("***********************************");
		
		
		 while(true) {
			 System.out.println("islem seciniz");
			 String islem=sc.nextLine();
			 
			 if(islem.equals("q")) {
				 System.out.println("Programdan cikiliyor");
				 break;
			 }
			 else if(islem.equals("1")) {
				 System.out.println("Bakiyeniz:"+erdem.getBalanca());
			 }
			 else if(islem.equals("2")){
				 
			 System.out.println("Yatirmak istediginiz tutar:");
			 int miktar=sc.nextInt();
			 sc.nextLine();
			  erdem.saveMoney(miktar);
			 
			 }
			 else if(islem.equals("3")){
				System.out.println("cekmek istediginiz miktar:");
				 int miktar=sc.nextInt();
				 sc.nextLine();
				 erdem.takeMoney(miktar);
			 
			 }
			 else {
				 System.out.println("Gecersiz tuslama yaptiniz-gecersiz islem");
				 
			 }
			 
			 
		 }
		
		
	}
	
	
}
