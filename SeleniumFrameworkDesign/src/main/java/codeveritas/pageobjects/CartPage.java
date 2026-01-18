package codeveritas.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import codeveritas.abstractcomponents.AbstractComponent;

public class CartPage extends AbstractComponent{
WebDriver driver;
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	private String removeToCartwithxpath = "//div[text()='XXX']/../../..//button[text()='Remove']";
	
	@FindBy(id="checkout")
	WebElement checkOut;

	
	public void removeProductFromCart(String productnameRemove){
		driver.findElement(By.xpath(removeToCartwithxpath.replace("XXX", productnameRemove))).click();
		
		
	}
	
//	public void removeProductFromCart2(String productName) {
//		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cart_item"));
//		for(WebElement product : cartProducts) {
//			String name = product.findElement(By.cssSelector(".inventory_item_name")).getText();
//			if(name.equals(productName)) {
//				product.findElement(By.xpath("//*[contains(@id,'remove')]")).click();
//				break;
//			}
//		}
//	}
	
	
	public CheckoutPage clickCheckOut() {
		
		checkOut.click();
		CheckoutPage Checkout =new CheckoutPage(driver);
		return Checkout;
		
	}
	
		
	}


