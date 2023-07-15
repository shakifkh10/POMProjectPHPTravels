package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class CheckOutPage  extends ProjectSpecificWrappers {
	public CheckOutPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public CheckOutPage clickOrder() throws InterruptedException{
		
		verifyTextContainsByXpath("//p[@class='product-title']","Mobile Applications");
		clickByXpath("//div[@class='panel-price']");
		Thread.sleep(500);
		clickById("btnCompleteProductConfig");
		clickById("checkout");
		clickById("btnCompleteOrder");
		Thread.sleep(3000);
		System.out.println((driver.findElementByXPath("//h3[contains(text(),'Invoice')]")).getText());
		Thread.sleep(1500);
		return new CheckOutPage(driver, test); 

}
}
