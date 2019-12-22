package com.eproc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.eproc.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//a[contains(text(),'Main Menu')]")
	WebElement mainMenuLink;
	
	@FindBy(xpath="//a[contains(text(),'Customers')]")
	WebElement customersLink;
	
	@FindBy(xpath="//a[contains(text(),'Items')]")
	WebElement itemsLink;
	
	
	@FindBy(xpath="//a[contains(text(),'Suppliers')]")
	WebElement suppliersLink;
	
	
	
	
	
	public HomePage() {
		 
		 PageFactory.initElements(driver, this);
		 
	}
	
	 public SuppliersPage clickOnSuppliersLink() {
		 suppliersLink.click();
		 return new SuppliersPage();
		 
	 }
	
	 
	
	
	
	
	

}



