package com.cucumber.endUserSteps;

import com.cucumber.pages.YouTubePages;

import net.thucydides.core.annotations.Step;

public class YouTubeEndUserSteps {
	YouTubePages youtube;
	
	@Step
	public void abrirYoutube1() {
		youtube.openAt(System.getProperties().getProperty("host"));
	}
	
	@Step
	public void buscarCancion1() {
		youtube.buscarCancion();
	}
	
	@Step
	public void cancionEncontrada1() {
		youtube.cancionEncontrada();
	}
}
