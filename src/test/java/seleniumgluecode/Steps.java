package seleniumgluecode;

import org.junit.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends TestBase {

	@Given("^El usuario se encuentra en la pagina Home$")
	public void el_usuario_se_encuentra_en_la_pagina_Home() throws Throwable {
		Assert.assertTrue(homepage.homePageIsDisplayed());
	}

	@When("^Hace click en el boton The little tester comics$")
	public void hace_click_en_el_boton_Start() throws Throwable {
		homepage.clickOnTitleComics();
	}

	@Then("^Se debe redirigir a la pantalla de comics$")
	public void visualiza_la_pagina_de_Badges() throws Throwable {
		Assert.assertTrue(comicspage.tituloComicsIsDisplayed());
		Assert.assertTrue(comicspage.tituloPaginaComics());
	}

	@When("^Ingresa la palabra (\\d+) en el buscador$")
	public void ingresaLaPalabraEnElBuscador(int arg1) throws Throwable {
		homepage.buscarDesdeHome(arg1);
	}

	@Then("^Se debe redirigir a la pantalla de busqueda$")
	public void seDebeRedirigirALaPantallaBusqueda() throws Throwable {
		Assert.assertTrue(busquedapage.verificarPantallaBusqueda());
	}

	@When("^Ingresa la palabra \"([^\"]*)\" en el buscador$")
	public void ingresaLaPalabraEnElBuscador(String entreComillas, String texto) throws Throwable {
		homepage.buscarDesdeHome(texto);
	}

	@When("^Ingreso multiple$")
	public void ingresoMultiple(DataTable tabla) throws Throwable {
		homepage.busquedaMultiple(tabla);
	}

}
