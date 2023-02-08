package com.inetbanking.testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.generics.baseclass;
import com.inetbanking.generics.dataproviderclass;
import com.inetbanking.pageobjects.Loginpage;

public class TC_Logintest_01 extends baseclass 
{
	
	@Test(dataProvider="login",dataProviderClass=dataproviderclass.class)
	public void logintest(String usern,String passwd)
	{
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("GTPL Bank Home Page"))
		{
		Loginpage pmclogin = new Loginpage(driver);
		pmclogin.username().sendKeys(usern);
		logger.info("entered username");
		pmclogin.password().sendKeys(passwd);
		logger.info("entered pasword");
		pmclogin.clickloginbtn();
		logger.info("login button clicked");
		
		if(driver.getTitle().contains("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			Assert.assertFalse(false);
			logger.info("login test failed");
		}
		
	}
	

	}
}
