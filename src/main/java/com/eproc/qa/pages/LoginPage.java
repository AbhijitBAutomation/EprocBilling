package com.eproc.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eproc.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="CompanyNameField")
	WebElement dropdown;

	@FindBy(name="UserNameEntryField")
	WebElement username;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(name="SubmitUser")
	WebElement loginBtn;
	
	@FindBy(id="login_logo")
	WebElement webERPLogo;
	
	//Initializing Page Objects
	public LoginPage(){
		
	   PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}
	
	public boolean validateWebERPImage() {
		return webERPLogo.isDisplayed();
		
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		
		
	}
	
	
	
	
	

}




