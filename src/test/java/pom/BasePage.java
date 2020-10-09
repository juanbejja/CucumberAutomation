package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	private WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By elemento) throws Exception {
		try {

			driver.findElement(elemento).click();

		} catch (Exception e) {
			throw new Exception("No se pudo clickear sobre el elemento: " + elemento);
		}
	}

	public boolean isDisplay(By elemento) throws Exception {
		try {
			return driver.findElement(elemento).isDisplayed();
		} catch (Exception e) {
			throw new Exception("No se pudo encontrar el elemento: " + elemento);
		}
	}

	public String getText(By elemento) throws Exception {
		try {
			return driver.findElement(elemento).getText();
		} catch (Exception e) {
			throw new Exception("No se pudo tomar el texto del elemento: " + elemento);
		}
	}

	public String getTitle() throws Exception {
		try {
			return driver.getTitle();
		} catch (Exception e) {
			throw new Exception("No se pudo obtener el titulo del driver");
		}
	}

}
