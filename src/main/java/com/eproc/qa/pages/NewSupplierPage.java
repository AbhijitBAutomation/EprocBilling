package com.eproc.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eproc.qa.base.TestBase;

public class NewSupplierPage extends TestBase {
	
	@FindBy(name="SupplierID")
	WebElement supplierCode;
	
	@FindBy(name="SuppName")
	WebElement supplierName;
	
	@FindBy(name="submit")
	WebElement insertNewSUpplier;
	
	public NewSupplierPage() {
		 
		 PageFactory.initElements(driver, this);
		 
	 }
	
	public void createNewSupplier(String supplyCode,String supplyName) {
		
		supplierCode.sendKeys(supplyCode);
		
		supplierName.sendKeys(supplyName);
		
		insertNewSUpplier.click();
		
		
		
	}
	
	
	
	 
 }
 
 
 
	
	
	
	
	
	 
	
	
	
	
	





