package com.cucumber.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class YouTubePages extends PageObject{
	
	WebDriver driver;
	
	@FindBy(xpath = "//div//input[@id='search']")
	private WebElementFacade barraBusqueda;
	
	@FindBy(xpath = "//button[@id='search-icon-legacy']")
	private WebElementFacade botonBuscar;
	
	@FindBy(xpath = "//div//div//div//h3//a[@title='Maroon 5 - Girls Like You ft. Cardi B']")
	private WebElementFacade cancion;
	
	
	public void buscarCancion(){
		barraBusqueda.sendKeys("Girls like you");
		botonBuscar.click();
	}
	
	public void cancionEncontrada() {
		cancion.isPresent();
	}

}
