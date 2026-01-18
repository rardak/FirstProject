package codeveritas.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import codeveritas.abstractcomponents.AbstractComponent;

public class LandingPage extends AbstractComponent{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	private String UName = "user-name";
	private String PassW = "password";
	private String SubB = "submit-button";
	
	public ProductCatalogue LoginWithUser(String username,String password) {
		driver.findElement(By.id(UName)).sendKeys(username);
		driver.findElement(By.name(PassW)).sendKeys(password);
		driver.findElement(By.className(SubB)).click();
		ProductCatalogue catalogue= new ProductCatalogue(driver);
		return catalogue;
			
	}
	public void goTo() {
		   driver.get("https://www.saucedemo.com/");
	   }
	

}

