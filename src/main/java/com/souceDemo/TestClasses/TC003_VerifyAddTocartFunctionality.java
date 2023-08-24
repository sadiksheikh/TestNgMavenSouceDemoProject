package com.souceDemo.TestClasses;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.souceDemo.POMClasses.HomePOMClass;
import com.souceDomo.UtilityClasses.Screenshot;

public class TC003_VerifyAddTocartFunctionality extends TestBaseClass {
	
	public WebDriver driver;
	
//	Logger log = Logger.getLogger("TestNGSuitSouceDemoProject");
////	@Parameters("browserName")
//	@BeforeMethod
//	public void setUp()
//	{
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\FireFoxDriver\\chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		
//		driver = new ChromeDriver(options);
//		
//		
////		else
////		{
////			System.setProperty("webdriver.gecko.driver", "./DriverFile\\geckodriver.exe");
////			
////			driver = new FirefoxDriver();
////		}
//		
//		PropertyConfigurator.configure("log4j.properties");
//		
//		log.info("Browser Open");
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.saucedemo.com/");
//		log.info("Site Open");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		LoginPOMClass login = new LoginPOMClass(driver);
//		login.SendUserName();
//		login.SendPassword();
//		login.ClickLoginButton();
//		log.info("Successfull Login");
//}
//		
	
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//		log.info("Browser Closed");
//	}

	@Test
	public void verifyAddToCartFunctionality() throws InterruptedException, IOException
	{
		
		
		HomePOMClass home = new HomePOMClass(driver);
		
		home.clickAddToCartAllItems();
		log.info("Click All Add to Cart Button");
		
		Screenshot.takeScreenshot(driver);
		
		log.info("Apply Validation");
		String expecteditem = "6";
		String actualitem = home.addToCartValidation();
		
		Assert.assertEquals(actualitem, expecteditem);
//		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
