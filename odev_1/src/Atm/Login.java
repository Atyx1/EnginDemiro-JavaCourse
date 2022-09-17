package Atm;

import java.util.Scanner;

public class Login {

	
	public  boolean login(Account account) {
		Scanner scanner=new Scanner(System.in);
		String user_name;
		String password;
		
		System.out.println("Username:");
		user_name=scanner.next();
		System.out.println("Password:");
		password=scanner.next();
		
		
		if(account.getUserName().equals(user_name)&& account.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
