package com.design.patterns.adapter;

public class Adapter extends Adaptee implements NeoBankAccount {

	private String cardNo;

	public Adapter(String name, String accountNo, String cardNo) {
		super(name, accountNo);
		this.cardNo = cardNo;
	}

	@Override
	public String getCardNo() {
		return cardNo;
	}

}
