package initiateDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.MakeMyTripHomePageObject;

public class initClass {
	
	public WebDriver driver;
	public MakeMyTripHomePageObject makeMyTripHomePage;
	
	@BeforeClass
	public void launch() {
		
		//launch browser
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver_windows.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Page Objects
		makeMyTripHomePage = new MakeMyTripHomePageObject(driver);
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	

}
