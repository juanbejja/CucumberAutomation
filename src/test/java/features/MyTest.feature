Feature: Categoria Comics
	Como usuario quiero leer chistes de testers para reirme
	
    Scenario: Ingresar a la categoria de comics desde la pantalla home
   	Given El usuario se encuentra en la pagina Home
    When Hace click en el boton The little tester comics
    Then Se debe redirigir a la pantalla de comics

    Scenario Outline: busqueda desde la home de iamlittletester
   	Given El usuario se encuentra en la pagina Home
    When Ingresa la palabra <busqueda> en el buscador
    Then Se debe redirigir a la pantalla de busqueda
    
		Examples:
		| busqueda | 
		| 2233		 | 
		
		Scenario: busqueda desde la home de iamlittletester
   	Given El usuario se encuentra en la pagina Home
    When Ingresa la palabra "random" en el buscador
    """
    cotto rng - solo
    """
    Then Se debe redirigir a la pantalla de busqueda
    
    @ejecutar
    Scenario: busqueda multiple desde la home de iamlittletester
    Given: El usuario se encuentra en la pagina Home
    When Ingreso multiple
    
    | datos		 | 
		| cotto		 | 
		| duki		 | 
		| cro			 | 
		| malafama | 
    
    
    