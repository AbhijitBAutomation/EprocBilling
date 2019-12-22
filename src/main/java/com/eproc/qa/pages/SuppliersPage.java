package com.eproc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eproc.qa.base.TestBase;

public class SuppliersPage extends TestBase {
	
	@FindBy(xpath="//a[text()='Add a New Supplier']")
	WebElement addANewSupplier;
	
	@FindBy(xpath="//input[@name='Search']")
	WebElement searchAllSuppliers;
	
 public SuppliersPage() {
		 
		 PageFactory.initElements(driver, this);
		 
	 }
 
 public  NewSupplierPage clickOnAddNewSuppliersLink() {
	 addANewSupplier.click();
	 return new NewSupplierPage();
	 
	 
	 
 }
 
 
 
	
	
	
	
	
	 
	
	
	
	
	

}



