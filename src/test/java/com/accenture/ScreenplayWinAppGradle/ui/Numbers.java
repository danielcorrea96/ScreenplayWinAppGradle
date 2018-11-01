package com.accenture.ScreenplayWinAppGradle.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Numbers extends PageObject {
	public static Target BOTON_1 = Target.the("Bot�n 1").located(By.name("Uno"));
	public static Target BOTON_MAS = Target.the("Bot�n M�s").located(By.name("M�s"));
	public static Target BOTON_IGUAL = Target.the("Bot�n igual a").located(By.name("Es igual a"));
}
