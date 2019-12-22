package com.eproc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eproc.qa.base.TestBase;
import com.eproc.qa.pages.HomePage;
import com.eproc.qa.pages.LoginPage;
import com.eproc.qa.pages.NewSupplierPage;
import com.eproc.qa.pages.SuppliersPage;

public class SuppliersPageTest extends TestBase{
	
    LoginPage loginPage;
    HomePage homePage;
    SuppliersPage suppliersPage;
   
	
	SuppliersPageTest(){
		
		super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
        loginPage=new LoginPage();
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        suppliersPage=homePage.clickOnSuppliersLink();
       
	
	}
	
	@Test
	public void verifyAddNewSupplier() {
		suppliersPage.clickOnAddNewSuppliersLink();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	

}
