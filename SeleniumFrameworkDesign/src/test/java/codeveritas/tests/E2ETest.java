package codeveritas.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2ETest {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "/Users/Hrishikesh/eclipse-workspace/chromedriver.exe");
       WebDriver driver = new ChromeDriver(options);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		System.out.println("Login page details");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		System.out.println("Navigated to Product catlogue page and added 3 products to cart");
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		
		System.out.println("Go inside cart");
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		
		System.out.println("Remove 1 product from cart");
	
		
//		System.out.println("Navigated to Product catlogue page and added 3 products to cart");
//		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
//		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
//		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();

	}

}
