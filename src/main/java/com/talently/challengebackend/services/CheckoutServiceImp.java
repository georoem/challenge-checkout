package com.talently.challengebackend.services;

import org.springframework.stereotype.Component;

import com.talently.challengebackend.model.Basket;
import com.talently.challengebackend.model.ProductQuantity;

@Component
public class CheckoutServiceImp implements CheckoutService {
	
	private Basket basket;

	@Override
	public ProductQuantity addProduct(ProductQuantity product) {
		if (basket == null) {
			addBasket();
		}
		basket.addProductQuantity(product);
		return product;
	}

	@Override
	public ProductQuantity removeProduct(ProductQuantity product) {
		if (basket == null) {
			addBasket();
		}
		basket.removeProductQuantity(product);
		return product;

	}

	@Override
	public void addBasket() {
		basket = new Basket();
	}

	@Override
	public void removeBasket() {
		basket = null;
	}

	@Override
	public Float getTotalAmount() {
		if (basket == null) {
			addBasket();
		}
		return basket.getTotalAmount();
	}

}
