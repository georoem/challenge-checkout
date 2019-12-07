package com.talently.challengebackend.model;

public class ProductQuantity {
	
	private Product product;
	
	private Integer quantity;
	
	public ProductQuantity() {
		super();
	}

	public ProductQuantity(Product product, Integer quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		ProductQuantity other = (ProductQuantity) obj;
		if(other.getProduct().getCode().equals(this.product.getCode())) {
			return true;
		} 	
		return false;
	}
	
	

}
