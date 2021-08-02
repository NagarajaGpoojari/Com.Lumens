package com.Lumens.StepDefinitions;

import com.Lumens.PagObject.IncreaseQuantityPage;
import cucumber.api.java.en.Then;

public class IncreaseQuantity_stepDef {
	
	IncreaseQuantityPage increase;

	@Then("^select the product and increase the quantity of the product$")
	public void select_the_product_and_increase_the_quantity_of_the_product() throws Throwable {
		increase=new IncreaseQuantityPage();
		increase.increaseQuantity();
	    

}
	}
