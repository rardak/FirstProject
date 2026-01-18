package codeveritas.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import codeveritas.pageobjects.LandingPage;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage landingpage;
	
	
	public WebDriver initializBrowser() {
	//	String browsername = "Chrome";
		String browsername = getData("browser");
		
		if(browsername.equals("Chrome"))  {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "/Users/Hrishikesh/eclipse-workspace/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		}
		else if(browsername.equals("Edge")) {
			//WebDriverManager.edgedriver().setup();
			//driver = new EdgeDriver();
		}
			
		else if(browsername.equalsIgnoreCase("firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			//driver = new FirefoxDriver();
		}
		return driver;
	}
	
	@BeforeMethod
	public LandingPage launchApplications() {
		driver= initializBrowser();
		landingpage = new LandingPage(driver);
		landingpage.goTo();
		return landingpage;
		}
	
		public String getData(String keyName) {
			Properties props = new Properties();
			try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\codeveritas\\resources\\GlobalData.properties")) {
				props.load(fis);
				return props.getProperty(keyName);
			} catch (IOException e) {
				throw new RuntimeException("Failed to load config.properties", e);
			}	
		}
		
		@AfterMethod
		public void tearDown() {
			System.out.println("in teardown method to close the browser");
			driver.quit();
		}
}
	
	
	

	
