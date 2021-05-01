package com.design.patterns.facade;

import java.util.UUID;

/**
 * This class is served as an aggregate one, which combines the information
 * about what to deliver Usually has its own id used for reference
 * 
 * @author akaliutau
 */
public class Order {

	private final String id = UUID.randomUUID().toString();
	private Phone phone;
	private Package pack;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Package getPack() {
		return pack;
	}

	public void setPack(Package pack) {
		this.pack = pack;
	}

	public String getId() {
		return id;
	}
}
