package com.Lumens.StepDefinitions;

import com.Lumens.ExcelData.ReadExcelFile;
import com.Lumens.PagObject.HomePage;

import cucumber.api.java.en.Then;

public class ScrollOparation_StepDef {
	
	HomePage Scroll=new HomePage();
	ReadExcelFile excelFile;
	
	@Then("^Use scroll up/down method in home page$")
	public void use_scroll_up_down_method_in_home_page() throws Throwable {
		Scroll.Scrolldown();
		Scroll.Scrollup();
	}


}
