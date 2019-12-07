package com.talently.challengebackend.services;

import com.talently.challengebackend.model.ProductQuantity;

public interface CheckoutService {
	
	public ProductQuantity addProduct(ProductQuantity product);
	
	public ProductQuantity removeProduct(ProductQuantity product);
	
	public void addBasket();
	
	public void removeBasket();
	
	public Float getTotalAmount();

}
