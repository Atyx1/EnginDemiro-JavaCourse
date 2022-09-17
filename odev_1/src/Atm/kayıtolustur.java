package Atm;

import java.util.Scanner;

public class kayıtolustur {
  Scanner sc1 = new Scanner(System.in);
	private String isim;
	private String soyad;
	private int bakiye;
	public kayıtolustur() {

        System.out.println("person name");
         String isimtake=sc1.nextLine();
	    this.isim=isimtake;
	    
	     
	     System.out.println("password:");
         String surname=sc1.nextLine();
	     this.soyad=surname;
	     soyad=this.soyad;
	     
	     System.out.println("balanca:");
         int para=sc1.nextInt();
	     this.bakiye=para;
	     bakiye=this.bakiye;
	     
	     
	     System.out.println("kayit olundu");
	
	
	}
	
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		
		this.bakiye=bakiye;
	}
	
	
	
	
}
