package codeveritas.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import codeveritas.TestComponents.BaseTest;
import codeveritas.pageobjects.CartPage;
import codeveritas.pageobjects.CheckoutPage;
import codeveritas.pageobjects.LandingPage;
import codeveritas.pageobjects.ProductCatalogue;

public class E2E_pageobjecttest extends BaseTest {

	//public static void main(String[] args) throws InterruptedException {
	//@Test
	public void E2ETest1() {
////		ChromeOptions options = new ChromeOptions();
////	    options.addArguments("--incognito");
////		System.setProperty("webdriver.chrome.driver", "/Users/Hrishikesh/eclipse-workspace/chromedriver.exe");
////       WebDriver driver = new ChromeDriver(options);
////       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
////		driver.get("https://www.saucedemo.com/");
////		driver.manage().window().maximize();
//		
//		
//		LandingPage login = new LandingPage(driver);
//		ProductCatalogue catalogue= new ProductCatalogue(driver);
//		CartPage Cart= new CartPage(driver);
//		CheckoutPage Checkout =new CheckoutPage(driver);
//		
//		System.out.println("Login page details");
//		login.LoginWithUser("standard_user", "secret_sauce");
////		driver.findElement(By.id("user-name")).sendKeys("standard_user");
////		driver.findElement(By.name("password")).sendKeys("secret_sauce");
////		driver.findElement(By.className("submit-button")).click();
//		
////		System.out.println("Navigated to Product catlogue page and added 3 products to cart");
////		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
////		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
////		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
////		
////		System.out.println("Go inside cart");
////		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
////		
////		System.out.println("Remove 1 product from cart");
//		System.out.println("Navigated to Product catlogue page and added 3 products to cart");
////		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
////		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
////		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
//		catalogue.addtoCrtwithXpath("Sauce Labs Backpack");
//		catalogue.addtoCrtwithXpath("Sauce Labs Bike Light");
//		catalogue.addtoCrtwithXpath("Sauce Labs Fleece Jacket");
//		System.out.println("Going inside cart now");
//		
//		System.out.println("Navigated to cart listing page and removed one product from cart");
//		System.out.println("Validate the added product");
//	//	driver.findElement(By.id("shopping_cart_container")).click();
//		catalogue.goToCart();
//		Cart.removeProductFromCart("Sauce Labs Backpack");
//		
//		
//		//driver.findElement(By.id("remove-sauce-labs-bike-light")).click(); //removes item from cart
//		
//		System.out.println("Going to checkout page and filling the necessary information");
//	//	driver.findElement(By.id("checkout")).click();
//		Cart.clickCheckOut();
////		driver.findElement(By.id("first-name")).sendKeys("ABC");
////		driver.findElement(By.id("last-name")).sendKeys("DEF");
////		driver.findElement(By.id("postal-code")).sendKeys("1234");
//		Checkout.fillCheckoutInfo("ghjkk","DEF","1234");  
//		//Thread.sleep(5);
//		
//		System.out.println("Clicked Continue on checkout page");
//		//driver.findElement(By.id("continue")).click();
//		Checkout.clickContiue(); 
//		System.out.println("Validate the checkout overveiw page");
//		
//		
//		//driver.findElement(By.id("finish")).click();
//		Checkout.clickFinish();
//		System.out.println("Validate the completion message");
//		//Thread.sleep(5);
//		
//		Checkout.BackHome();
//		System.out.println("Back to product catalogue page");
//		//driver.findElement(By.id("back-to-products")).click();
//	
//		
//		
//
	}
	
	@Test
	public void E2ETest2() {
//		ChromeOptions options = new ChromeOptions();
//	    options.addArguments("--incognito");
//		System.setProperty("webdriver.chrome.driver", "/Users/Hrishikesh/eclipse-workspace/chromedriver.exe");
//       WebDriver driver = new ChromeDriver(options);
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		
	//	LandingPage login = launchApplications();
		//LandingPage login = new LandingPage(driver);
		//ProductCatalogue catalogue= new ProductCatalogue(driver);
		//CartPage Cart= new CartPage(driver);
		//CheckoutPage Checkout =new CheckoutPage(driver);
		
		System.out.println("Login page details");
		String  Loginusername = getData("username");
		String  Loginpasssword = getData("passsword");
		
		ProductCatalogue catalogue = landingpage.LoginWithUser(Loginusername, Loginpasssword);
	
	
		System.out.println("Navigated to Product catlogue page and added 3 products to cart");
		catalogue.addtoCrtwithXpath("Sauce Labs Backpack");
		catalogue.addtoCrtwithXpath("Sauce Labs Bike Light");
		catalogue.addtoCrtwithXpath("Sauce Labs Fleece Jacket");
		System.out.println("Going inside cart now");
		
		System.out.println("Navigated to cart listing page and removed one product from cart");
		System.out.println("Validate the added product");
		CartPage Cart = catalogue.goToCart();
		Cart.removeProductFromCart("Sauce Labs Backpack");
		
		System.out.println("Going to checkout page and filling the necessary information");
		CheckoutPage Checkout= Cart.clickCheckOut();
		Checkout.fillCheckoutInfo("ghjkk","DEF","1234");  
		
		System.out.println("Clicked Continue on checkout page");
		Checkout.clickContiue(); 
		System.out.println("Validate the checkout overveiw page");
				
		Checkout.clickFinish();
		System.out.println("Validate the completion message");
		
		Checkout.BackHome();
		System.out.println("Back to product catalogue page");
		
		
	
		
		

	}
	
	@Test
	public void E2ETest3(){
		//[8:59 am, 11/12/2025] Rohit Deshmukh: 1> Login
		//2> Check Total Number of products 
		//3>Add 2 products to cart
		//4>Continue shopping
		//5>Add one more product to cart
		//6>Go to cart
		//7>Checkout ->Fill INformatiom->Continue
		//8>Validate checkout overview page (total cost, individual cost,qnty)
		//9>finish
		//[8:59 am, 11/12/2025] Rohit Deshmukh: after finish-click Logout

		
		
	}
	


}
