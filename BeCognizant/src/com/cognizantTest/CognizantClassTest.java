package com.cognizantTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.CognizantPage;

public class CognizantClassTest extends BaseClass {
	CognizantPage cognizant;
	@BeforeMethod
	public void Start() throws InterruptedException
	{
		Browserlaunch();
		Thread.sleep(3000);
	}
	@Test
	public void Testing() throws InterruptedException {
		cognizant= new CognizantPage(driver);
		cognizant.getAutomate();
		
	}
	
	
	@AfterMethod
	public void end() {
		quit();
	}
	}

	

