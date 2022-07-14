package ChallengingDom.heroChallengingDom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	// initialize driver
	WebDriver driver;

	// setting the driver executable
	public void configuration() {
		System.setProperty("webdriver.gecko.driver", "Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Launcing browser");
		// open browser with URL
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
	}

	@BeforeClass
	public void initialize() {
		configuration();
	}

	@AfterClass
	public void tearDown() {
		 driver.quit();
		 Reporter.log("Browser Closed After Testing");
	}
}
