package com.Lumens.StepDefinitions;

import java.util.ArrayList;

import com.Lumens.ExcelData.ReadExcelFile;


import cucumber.api.java.en.Then;

public class PromoCode_StepDef {
	ReadExcelFile	excelFile=new ReadExcelFile();
	
    com.Lumens.PagObject.PromoCodePage promo=new com.Lumens.PagObject.PromoCodePage();
   
    @Then("^user should click on cart and enter the coupon code and click apply$")
    public void user_should_click_on_cart_and_enter_the_coupon_code_and_click_apply() throws Throwable {
    	ArrayList<String> testdata=excelFile.getData("user1");
         promo.applyCouponCode(testdata.get(5));
    }

}
