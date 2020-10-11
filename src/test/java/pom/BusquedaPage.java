package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusquedaPage extends Utilidades {

	public BusquedaPage(WebDriver driver) {
		super(driver);
	}

	private By tituloBusqueda = By.xpath("//h1[contains(text(),'Search Results for:')]");
	
	public boolean verificarPantallaBusqueda() throws Exception {
		return this.isDisplay(tituloBusqueda);
	}

}
