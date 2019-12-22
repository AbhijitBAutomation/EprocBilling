package com.eproc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.eproc.qa.base.TestBase;
import com.eproc.qa.pages.HomePage;
import com.eproc.qa.pages.LoginPage;
import com.eproc.qa.pages.NewSupplierPage;
import com.eproc.qa.pages.SuppliersPage;
import com.eproc.qa.util.TestUtil;

public class NewSupplierAddTest extends TestBase{
	
    LoginPage loginPage;
    HomePage homePage;
    SuppliersPage suppliersPage;
    NewSupplierPage newSupplier;
    
    String sheetName="suppliers";
	
	NewSupplierAddTest(){
		
		super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
        loginPage=new LoginPage();
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        suppliersPage=homePage.clickOnSuppliersLink();
        newSupplier=suppliersPage.clickOnAddNewSuppliersLink();
	
	}
	
	
	@DataProvider
	
	   Object[][] getEPROCTestData() {
		
		Object[][] data=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	
	@Test(dataProvider="getEPROCTestData")
	public void validateNewSupplier(String supplierCode,String supplierName ) {
		
		newSupplier.createNewSupplier(supplierCode, supplierName);
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	

}
