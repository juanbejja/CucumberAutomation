package seleniumgluecode;

import org.openqa.selenium.WebDriver;

import pom.BusquedaPage;
import pom.ComicsPage;
import pom.HomePage;

public class TestBase {

	protected WebDriver driver = Hooks.getDriver();
	protected HomePage homepage = new HomePage(driver);
	protected ComicsPage comicspage = new ComicsPage(driver);
	protected BusquedaPage busquedapage = new BusquedaPage(driver);


}
