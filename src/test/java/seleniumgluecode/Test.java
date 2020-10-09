package seleniumgluecode;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test extends TestBase {

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

}
