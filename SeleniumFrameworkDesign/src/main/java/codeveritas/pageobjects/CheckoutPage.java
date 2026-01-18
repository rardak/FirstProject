package codeveritas.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import codeveritas.abstractcomponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent{
WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
//	driver.findElement(By.id("first-name")).sendKeys("ABC");
//	driver.findElement(By.id("last-name")).sendKeys("DEF");
//	driver.findElement(By.id("postal-code")).sendKeys("1234");
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement postalcode;
	
	//driver.findElement(By.id("continue")).click();
	@FindBy(id="continue")
	WebElement cntue;
	
	//driver.findElement(By.id("finish")).click();
	@FindBy(id="finish")
	WebElement finish;
	
	@FindBy(id="back-to-products")
	WebElement backhome;
	

public void fillCheckoutInfo(String Firstname,String Sirname,String zipcode){
	
	firstname.sendKeys(Firstname);
	lastname.sendKeys(Sirname);
	postalcode.sendKeys(zipcode);
	
}

public void clickContiue() {
	cntue.click();
}

public void clickFinish() {
	finish.click();
}
public void BackHome() {
	backhome.click();

}
}


