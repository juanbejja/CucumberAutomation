package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;

public class HomePage extends Utilidades {
	private String tituloPagina = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
	private By textLinkComics = By.xpath("//*[contains(text(),'The Little Tester comics')]");
	private By inputBuscador = By.xpath("//input[@type=\"search\"]");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public boolean homePageIsDisplayed() throws Exception {
		return this.getTitle().equals(tituloPagina);
	}

	public void clickOnTitleComics() throws Exception {
		this.click(textLinkComics);
	}

	public void buscarDesdeHome(int palabra) throws Exception {
		this.sendKeys(inputBuscador, palabra);
		this.submit(inputBuscador);
	}

	public void buscarDesdeHome(String palabra) throws Exception {
		this.sendKeys(inputBuscador, palabra);
		this.submit(inputBuscador);
	}

	public void busquedaMultiple(DataTable tabla) throws Exception {
		List<List<String>> rows = tabla.asLists(String.class);
		List<List<String>> rowEspecificas = rows.subList(1, rows.size());

		for (List<String> row : rowEspecificas) {
			String datos = String.valueOf(row);
			System.out.println("me hize hombre solo: " + datos);
			this.sendKeys(inputBuscador, datos);
		}
	}
}
