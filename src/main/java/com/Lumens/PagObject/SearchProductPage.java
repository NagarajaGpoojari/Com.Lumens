package com.Lumens.PagObject;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.Lumens.Util.BaseClass;

	public class SearchProductPage extends BaseClass {
		
		@FindBy(xpath="//a[@class='ltkpopup-close']")
		WebElement popup;
		
		@FindBy(xpath="//div[@class='btn-group dropdown-group']")
		WebElement mouseOverOnAccount;
		
		 @FindBy(xpath="//div[@class='dropdown-menu']//a[text()='Sign In']")
		 WebElement signIn;
		    
		 @FindBy(id="dwfrm_login_username")
		 WebElement email;
		    
		 @FindBy(id="dwfrm_login_password")
		 WebElement password;
		    
		@FindBy(xpath="//button[@name='dwfrm_login_login']")
		WebElement loginButton;
		
		@FindBy(id = "searchinput")
		WebElement searchBar;
		     
	     @FindBy(xpath= "//*[@id=\"simplesearchbtn\"]/i")
	     WebElement searchButton;
		     
		     public SearchProductPage() {
		       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		       PageFactory.initElements(driver, this);
		        }
		     public void searchProduct() {
		    	 
		    	 WebDriverWait wait = new WebDriverWait (driver, 60);
		    	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			     js1.executeScript("arguments[0].click();", searchBar);
		    	
			     WebDriverWait wait1 = new WebDriverWait (driver, 60);
		    	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("searchinput"))));
		    	 
		         searchBar.sendKeys("lights");
		         
		         JavascriptExecutor js = (JavascriptExecutor) driver;
			     js.executeScript("arguments[0].click();", searchButton);
			     System.out.println("item searching is succesfull");  

		     }

}
