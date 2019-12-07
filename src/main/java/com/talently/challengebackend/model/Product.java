package com.talently.challengebackend.model;

/**
 * Entity class for Product
 * @author Jorge Aguirre
 *
 */
public class Product {
	
	public static enum CODE {VOUCHER, TSHIRT, MUG};
	
	private CODE code;
	private String name;
	private Float price;
	
	public Product() {
		super();
	}

	public Product(CODE code, String name, Float price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public CODE getCode() {
		return code;
	}
	
	public void setCode(CODE code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Float getPrice() {
		return price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	

}
