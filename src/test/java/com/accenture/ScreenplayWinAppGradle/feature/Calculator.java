package com.accenture.ScreenplayWinAppGradle.feature;

import static net.serenitybdd.screenplay.GivenWhenThen.when;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.accenture.ScreenplayWinAppGradle.task.Add;

import io.appium.java_client.windows.WindowsDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class Calculator {
	Actor daniel = Actor.named("Daniel");
	
	@Managed(driver = "appium")
    public WebDriver driver;
	
	@Before
	  public void danielCanDriver() throws MalformedURLException { 
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
        daniel.can(BrowseTheWeb.with(driver));
		}
	
	 @Test
	  public void calculator() {
		  when(daniel).attemptsTo(Add.theApp());	  
	  }  
	
}
