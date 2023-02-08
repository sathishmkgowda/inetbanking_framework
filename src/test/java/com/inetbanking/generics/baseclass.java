package com.inetbanking.generics;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseclass implements frameworkconstants
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Logger logger;
	

	
	@BeforeClass
	public static void openbrowser()
	{
		System.setProperty(gecko_key,gecko_value);
		  driver = new FirefoxDriver();
		  logger = LogManager.getLogger(baseclass.class);
		  PropertyConfigurator.configure("log4j2.properties");
		  
	}
	
	@BeforeMethod
	public static void openapp()
	{
		driver.get(url);
		logger.info("url is opened");
		wait =new WebDriverWait(driver,10);
	}

	@AfterMethod
	public static void closeapp(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			genericScreenshot.getphoto(driver);
			
			ITestNGMethod failed = result.getMethod();
			
			System.out.println("the failed testscript is "+ failed);
			
		}
		
		
	}
	@AfterClass
	public static void closebrowser()
	{
		driver.quit();
	}
}
