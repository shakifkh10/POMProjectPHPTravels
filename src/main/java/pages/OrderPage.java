package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class OrderPage extends ProjectSpecificWrappers{
	
	public OrderPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

	//	if(!verifyTitle("Login - PHPTRAVELS")){
			//reportStep("This is not Login Page", "Fail");
		}
	
	
	public CheckOutPage clickMobile() throws InterruptedException{
		clickByXpath("//a[@menuitemname='Mobile']");
		Thread.sleep(500);
		clickById("product1-order-button");
		
		return new CheckOutPage(driver, test); 
	
	
	}
	
	
	
	
	}


	


