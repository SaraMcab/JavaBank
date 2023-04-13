package project;

import java.util.ArrayList;

public class Account {
	private String name;
	private  String uuid; 
	private User holder;
	private ArrayList<Transaction> transactions;
	
	public Account(String name, User holder, Bank theBank) {
		this.name=name;
		this.holder=holder;
		
		
		//get new account UUID
		this.uuid=theBank.getNewUserUUID();
		
		//init transactions 
		this.transactions= new ArrayList<Transaction>();
		 
	}

	public String getUUID() {
		return this.uuid;
	}

}
