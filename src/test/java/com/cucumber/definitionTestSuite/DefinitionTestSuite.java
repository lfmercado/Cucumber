package com.cucumber.definitionTestSuite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features="src/test/resources/features/ConsultarVideo.feature", 
	tags= {"@BuscarVideoEnYoutube", ""	
	+"@tag1"
	})


public class DefinitionTestSuite {
	

}
