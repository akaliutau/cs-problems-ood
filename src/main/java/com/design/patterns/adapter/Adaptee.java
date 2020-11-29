package com.design.patterns.adapter;

public class Adaptee {
	private final String name;
	private final String accountNo;

	public Adaptee(String name, String accountNo) {
		this.name = name;
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public String getAccountNo() {
		return accountNo;
	}

}
