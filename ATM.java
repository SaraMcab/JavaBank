package project;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    Bank theBank=new Bank("Bank of Drausin ");
	    
	    //add a user, which also create a savings account 
	    User aUser = theBank.addUser("John","Doe","1234");
	    
	    //add a checking account for our user
	    Account newAccount = new Account("Checking", aUser, theBank); 
	    aUser.addAccount(newAccount);
	    theBank.addAccount(newAccount);
	    
	    User curUser;
	    while(true) {
	    	//stay in the login prompt until successful login
	    	curUser = ATM.main(theBank, sc);
	    	
	    	//stay in main menu until user quits 
	    	ATM.printUserMenu(curUser, sc);
	    	
	    	
	    	
	    	//(MINUTO 56:00)
	    	// comentario
	    	
	    }
	    

	}

}
