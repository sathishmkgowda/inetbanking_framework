package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addnewcustomer 
{
	@FindBy(xpath = "//a[.='New Customer']")
	WebElement newcustomerlink;
	
	@FindBy(name = "name")
    WebElement customernam;
	
	@FindBy(name="rad1")
	WebElement maleradio;
	
	@FindBy(id = "dob")
	WebElement dob;
	
	@FindBy(name = "addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement cityname;
	
	@FindBy(name="state")
	WebElement statename;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement telephoneno;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="sub")
	WebElement submit;
	
	public addnewcustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	public WebElement addnewcustomerlink()
	{
	 return newcustomerlink;
	}
	public WebElement customername()
	{
	 return customernam;
	}
	
	public WebElement gender()
	{
		return maleradio;
	}
	
	public WebElement dob()
	{
		return dob;
	}
	public WebElement address()
	{
		return address;
	}
	
	public WebElement city()
	{
		return cityname;
	}
	public WebElement state()
	{
		return statename;
	}
	public WebElement pin()
	{
		return pin;
	}
	public WebElement telephone()
	{
		return telephoneno;
	}
	
	public WebElement email()
	{
		return email;
	}
	public WebElement submitbtn()
	{
		return submit;
	}
}
