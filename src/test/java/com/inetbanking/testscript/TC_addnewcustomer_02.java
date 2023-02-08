package com.inetbanking.testscript;

import org.testng.annotations.Test;

import com.inetbanking.generics.baseclass;
import com.inetbanking.generics.dataproviderclass;
import com.inetbanking.pageobjects.Loginpage;
import com.inetbanking.pageobjects.addnewcustomer;

public class TC_addnewcustomer_02 extends baseclass
{
	@Test(dataProvider = "addnewcustomer",dataProviderClass = dataproviderclass.class)
	public void addnewcustom(String usern,String passwd,String customern,String place,String city,String state,String pin,String phone,String email)
	{
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("GTPL Bank Home Page"))
		{
		Loginpage pmclogin = new Loginpage(driver);
		pmclogin.username().sendKeys(usern);
		pmclogin.password().sendKeys(passwd);
		pmclogin.clickloginbtn();
		
	  addnewcustomer pmcaddnew = new addnewcustomer(driver);
		pmcaddnew.addnewcustomerlink().click();
		pmcaddnew.customername().sendKeys(customern);
		pmcaddnew.gender().click();
		pmcaddnew.dob().click();
		pmcaddnew.address().sendKeys(place);
		pmcaddnew.city().sendKeys(city);
		pmcaddnew.state().sendKeys(state);
		pmcaddnew.pin().sendKeys(pin);
		pmcaddnew.telephone().sendKeys(phone);
		pmcaddnew.email().sendKeys(email);
		pmcaddnew.submitbtn().click();
		
		
		}
		
	}
   
}
