package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class ProfilePage extends ProjectSpecificWrappers {
	public ProfilePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		/*
		 * if(!verifyTitle("ToolsQA")){ reportStep("This is not Profile Page", "Fail");
		 * }
		 */
	}
	
	public OrderPage clickServices() throws InterruptedException{
		clickByXpath("//li[@menuitemname='Services']");
		Thread.sleep(500);
		clickByXpath("//li[@menuitemname='Order New Services']");
		Thread.sleep(500);

		return new OrderPage(driver, test); 
		
	
	}

}
