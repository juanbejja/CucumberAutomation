package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	private String tituloPagina = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
	private By textLinkComics = By.linkText("The Little Tester comics");

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean homePageIsDisplayed() throws Exception {
		return this.getTitle().equals(tituloPagina);
	}
	
	public void clickOnTitleComics() throws Exception {
		this.click(textLinkComics);
	}
	
}
