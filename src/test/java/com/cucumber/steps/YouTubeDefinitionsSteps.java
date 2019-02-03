package com.cucumber.steps;

import org.openqa.selenium.WebDriver;

import com.cucumber.endUserSteps.YouTubeEndUserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class YouTubeDefinitionsSteps {
	@Managed()
	public WebDriver driver;
	
	@Steps
	YouTubeEndUserSteps amor;
	
	@Given("^El usuario ingresa a youtube$")
	public void el_usuario_ingresa_a_youtube() throws Throwable {
	 amor.abrirYoutube1();       
    }

	
    @When("^El usuario busca el nombre de su cancion favorita$")
    public void el_usuario_busca_el_nombre_de_su_cancion_favorita() throws Throwable {
        amor.buscarCancion1();
    }

    @Then("^El usurio deberia vizualizar el listado de canciones$")
    public void el_usurio_deberia_vizualizar_el_listado_de_canciones() throws Throwable {
        amor.cancionEncontrada1();
    }


}
