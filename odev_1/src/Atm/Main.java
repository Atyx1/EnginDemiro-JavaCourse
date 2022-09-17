package Atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
      Atm atm=new Atm();
      
      
     
      kayıtolustur kayıt= new kayıtolustur();
    
      Account first =new Account(kayıt.getIsim(),kayıt.getSoyad(),kayıt.getBakiye());
      
       atm.work(first);
      
		
		
	}

}
