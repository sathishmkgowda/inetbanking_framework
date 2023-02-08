package com.inetbanking.generics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class genericScreenshot
{
	public static void getphoto(WebDriver driver) throws IOException
	{
		String photo="./Screenshots";
		Date d=new Date();
		String replace=d.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dst = new File(photo+replace+".jpeg");
	    FileHandler.copy(src, dst);
	   
	    
	}

}
