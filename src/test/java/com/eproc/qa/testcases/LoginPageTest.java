package com.eproc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eproc.qa.base.TestBase;
import com.eproc.qa.pages.HomePage;
import com.eproc.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
    LoginPage loginPage;
    HomePage homePage;
	
	LoginPageTest(){
		
		super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
        loginPage=new LoginPage();
		}
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "webERP Login screen");
	}
	
	@Test(priority=2)
	public void webERPlogoImageTest() {
		
		boolean flag = loginPage.validateWebERPImage();
		Assert.assertTrue(flag);
		
	}
	
	
	@Test(priority=3)
	public void loginTest() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	

}
