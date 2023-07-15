package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase1 extends ProjectSpecificWrappers {
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Order New Mobile";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Tawfiq";
	}

	@Test
	public void testCase1() throws InterruptedException {
		System.out.println("Starting Test 1");
		new LoginPage(driver, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickServices() 
		.clickMobile()
		.clickOrder();
		
		
	}

}
