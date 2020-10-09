package seleniumgluecode;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

	private static WebDriver driver;
	private DriverManager driverManager;
	
	@Before
	public void setUp() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
		driver.get("https://imalittletester.com/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driverManager.quitDriver();
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
