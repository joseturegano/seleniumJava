package es.panel.curso.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CapaTecnica {
	private WebDriver driver;

	public CapaTecnica(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void writeInputWithLocatorAndTextWithotSubmit(By by, String input) {
		WebElement home = driver.findElement(by);
		home.sendKeys(input);
	}
	
	public void writeInputWithLocatorAndText(By by, String input) {
		WebElement home = driver.findElement(by);
		home.sendKeys(input);
		home.submit();
	}

	public void clickInputWithLocator(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10); 
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();	
		} catch (Exception e) {
			System.out.println("Pintando la excepcion: " + e.getMessage());
		}
	
	}

	public String getElement(By locator) {
		return driver.findElement(locator).getText();
	}

}
