package com.talently.challengebackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.talently.challengebackend.model.ProductQuantity;
import com.talently.challengebackend.services.CheckoutService;

@Controller
@RequestMapping("/checkout")
public class CheckoutController {
	
	@Autowired
	CheckoutService checkoutService;
	
	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public @ResponseBody ProductQuantity addProduct(@RequestBody ProductQuantity product) {
		return checkoutService.addProduct(product);
	}

	@RequestMapping(value = "/product/remove", method = RequestMethod.POST)
	public @ResponseBody ProductQuantity removeProduct(@RequestBody ProductQuantity product) {
		return checkoutService.removeProduct(product);
	}

	@RequestMapping(value = "/basket/create", method = RequestMethod.POST)
	public void addBasket() {
		checkoutService.addBasket();
	}

	@RequestMapping(value = "/basket/remove", method = RequestMethod.POST)
	public void removeBasket() {
		checkoutService.removeBasket();
	}

	@RequestMapping(value = "/basket/amount", method = RequestMethod.GET)
	public @ResponseBody Float getTotalAmount() {
		return checkoutService.getTotalAmount();
	}

}
