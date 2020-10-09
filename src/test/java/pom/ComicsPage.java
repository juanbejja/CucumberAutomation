package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicsPage extends BasePage {

	private By tituloComics = By.className("page-title");
	private String titlePage = "Category: comics";

	public ComicsPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean tituloComicsIsDisplayed() throws Exception {
		return this.isDisplay(tituloComics);
	}
	
	public boolean tituloPaginaComics() throws Exception {
		return this.getText(tituloComics).equals(titlePage);
	}

}
