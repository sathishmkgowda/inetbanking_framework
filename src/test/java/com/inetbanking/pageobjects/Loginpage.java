package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	@FindBy(name = "uid")
	WebElement useridtxt;
	
	@FindBy(name = "password")
	WebElement passwordtxt;
	
	@FindBy(name="btnLogin")
	WebElement btnc;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

 
	public void clickloginbtn()
	{
		btnc.click();
	}

	public WebElement username() {
		// TODO Auto-generated method stub
		return useridtxt;
	}


	public WebElement password() {
		// TODO Auto-generated method stub

		return passwordtxt;
	}


}
