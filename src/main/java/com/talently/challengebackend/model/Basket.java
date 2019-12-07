package com.talently.challengebackend.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity class for Basket
 * @author Jorge
 *
 */
public class Basket {
	private List<ProductQuantity> products = new ArrayList<ProductQuantity>();
	
	public List<ProductQuantity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductQuantity> products) {
		this.products = products;
	}

	public void addProductQuantity(ProductQuantity product) {
		if(products.contains(product)) {
			ProductQuantity actualProduct = products.get(products.indexOf(product));
			products.remove(actualProduct);
			actualProduct.setQuantity(actualProduct.getQuantity()+1);
			products.add(actualProduct);
		} else {
			products.add(product);
		}
	}
	
	public void removeProductQuantity(ProductQuantity product) {
		if(products.contains(product)) {
			ProductQuantity actualProduct = products.get(products.indexOf(product));
			products.remove(actualProduct);
			if(actualProduct.getQuantity()-1 > 0) {
				actualProduct.setQuantity(actualProduct.getQuantity()-1);
				products.add(actualProduct);
			}
		}
	}
	
	public void removeBasket() {
		products.clear();
	}
	
	public Float getTotalAmount() {
		Float total = 0f;
		for (ProductQuantity productQuantity : products) {
			total += productQuantity.getProduct().getPrice() * productQuantity.getQuantity();
		}
		
		return total;
	}
	
}
