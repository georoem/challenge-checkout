package com.talently.challengebackend.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.talently.challengebackend.model.Product;
import com.talently.challengebackend.model.ProductQuantity;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CheckoutControllerTest {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
    public void addProductAndGetTotalAmountTest() throws Exception {
		this.mockMvc.perform(post("/checkout/product/add", productQunatity())).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("MUG")));;
		
//		
//        this.mockMvc.perform(get("/checkout/basket/amount")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("7.50")));
    }

    private ProductQuantity productQunatity() {
    	return new ProductQuantity(new Product(Product.CODE.MUG, "Cabify", 7.50f), 1); 
	}
 
}
