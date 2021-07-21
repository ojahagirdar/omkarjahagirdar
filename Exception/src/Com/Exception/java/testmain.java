package Com.Exception.java;

public class testmain {

	public static void main(String[] args) {
		 Account acct = new Account();
		 
		 System.out.println("=============*Withdrawing *===============================");
		 
		 
	        System.out.println("Account balance : " + acct.balance());
	        System.out.println("Withdrawing 260");
	        acct.withdraw(260);
	        System.out.println("Current balance : " + acct.balance());
	    
  	 System.out.println("===================*  Deposit  *============================");
	  System.out.println("Account balance : " + acct.balance());
	     acct.deposit(2600);
	     System.out.println("Current balance : " + acct.balance());
	     
	     
	     
	}

}
