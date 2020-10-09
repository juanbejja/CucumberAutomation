Feature: Categoria Comics
	Como usuario quiero leer chistes de testers para reirme

  	Scenario: Ingresar a la categoria de comics desde la pantalla home
    Given El usuario se encuentra en la pagina Home
    When Hace click en el boton The little tester comics
    Then Se debe redirigir a la pantalla de comics
