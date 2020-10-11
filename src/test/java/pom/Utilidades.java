package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Utilidades {

	private WebDriver driver;

	public Utilidades(WebDriver driver) {
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
			Thread.sleep(1000);
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

	public void sendKeys(By elemento, String buscar) throws Exception {
		try {
			driver.findElement(elemento).clear();
			driver.findElement(elemento).sendKeys(buscar);
		} catch (Exception e) {
			throw new Exception("No se pudo ingresar: " + buscar + " en el elemento: " + elemento);
		}
	}

	public void sendKeys(By elemento, int buscar) throws Exception {
		try {
			String buscarString = Integer.toString(buscar);
			driver.findElement(elemento).sendKeys(buscarString);
		} catch (Exception e) {
			throw new Exception("No se pudo ingresar: " + buscar + " en el elemento: " + elemento);
		}
	}

	public void submit(By elemento) {
		driver.findElement(elemento).sendKeys(Keys.ENTER);
	}

}
