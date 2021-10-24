package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public List<Account> findAccounts(boolean tripWire) {
		
		if (tripWire) {
			throw new RuntimeException("Wheres the PlayStation 5?");
		}
		
		List<Account> myAccounts = new ArrayList<>();
		
		Account temp1 = new Account("Nathen", "Gold");
		Account temp2 = new Account("Nedine", "Platinum");
		Account temp3 = new Account("Indiana", "Silver");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
	
	public void addAccount(Account theAcccount) {
		System.out.println(getClass() + " : DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + ": doWork()");
		return false;
		
	}

	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}
	
	
	
}
