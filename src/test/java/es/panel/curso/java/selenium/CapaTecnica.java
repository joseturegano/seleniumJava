package es.panel.curso.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CapaTecnica {
	private WebDriver driver;

	public CapaTecnica(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void writeInputWithLocatorAndText(By by, String input) {
		WebElement home = driver.findElement(by);
		home.sendKeys(input);
		home.submit();
	}

}
