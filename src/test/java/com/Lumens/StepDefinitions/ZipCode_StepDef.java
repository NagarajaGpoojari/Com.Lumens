package com.Lumens.StepDefinitions;



import com.Lumens.PagObject.ZipCodePage;

import cucumber.api.java.en.Then;

public class ZipCode_StepDef {
	 ZipCodePage zipCode = new ZipCodePage();
	 
	 
	    
	    @Then("^enter the zipCode$")
	    public void enter_the_zipCode() throws Throwable {
	        
	        zipCode.enterZipCode();

	}
}



