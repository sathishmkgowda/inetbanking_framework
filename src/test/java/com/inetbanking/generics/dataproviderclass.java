package com.inetbanking.generics;

import org.testng.annotations.DataProvider;

public class dataproviderclass 
{
	@DataProvider(name="login")
	public String[][] date()
	{
		String[][] arr= {{"mngr466763","EnumEjA"}};
		return arr;
		
	}
   
	@DataProvider(name="addnewcustomer")
	public String[][] addnewcusto()
	{
		String [][] necust= {{"mngr466763","EnumEjA","sathish","london","bengalore","karnataka","500400","1234567890","s@gmail.com"}};
		return necust;
	}
}
