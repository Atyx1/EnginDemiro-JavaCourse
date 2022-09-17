package Atm;

public class Account {
	private String userName;
	private String password;
	private  int balanca;
	
	public Account(String userName, String password, int balanca) {
		
		this.userName = userName;
		this.password = password;
		this.balanca = balanca;
	}

	
	public void saveMoney(double miktar) {
		balanca=balanca+(int)miktar; //this.balanca +=miktar  aynısı ama zaten burda başka balanca olmadığı için farketmiyor
		System.out.println("Current balanca:"+balanca);
	}
	public void takeMoney(double miktar) {
		if(miktar > 1500) {
			System.out.println("you can't make a draft mucher than one thousand five hundred ");
		}
		else if(balanca-miktar<0) {
			System.out.println("you have not money in  your account what as much as you want");
		}
		else {
			balanca-=miktar;
			System.out.println("you  taken money: "+miktar+"\n"+"Current Balance:"+balanca);
		}
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalanca() {
		return balanca;
	}

	public void setBalance(int balanca) {
		this.balanca = balanca;
	}
	
	
}
