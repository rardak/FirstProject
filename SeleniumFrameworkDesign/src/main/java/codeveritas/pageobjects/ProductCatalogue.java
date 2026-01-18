package codeveritas.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import codeveritas.abstractcomponents.AbstractComponent;

public class ProductCatalogue extends AbstractComponent{ 
WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="shopping_cart_container")
	WebElement cartBtn;
	
//	@FindBy(xpath ="//[text()='XXX']/../../..//[text()='Add to cart']")
//	WebElement addToCartBtnproduct;
	
	private String addtoCrtProductname = "//div[text()='XXX']/../../..//button[text()='Add to cart']";
	
	public void addtoCrtwithXpath(String productname){
		driver.findElement(By.xpath(addtoCrtProductname.replace("XXX", productname))).click();
		
		
	}
	public CartPage goToCart(){
		cartBtn.click();
		CartPage Cart= new CartPage(driver);
		return Cart;
		
	}

}
