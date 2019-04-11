package es.panel.curso.java.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;


@Epic("Alumno Tests Epic")
@Feature("Super Features")
class AppTest {

	@Test
	void testConstructorAlumno() {
		//System.setProperty("webdriver.chrome.driver", "D:\\ENVIRONMENT\\selenium\\chromedriver\\chromedriver.exe");
		// Clave Valor
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/xhtml");
		WebElement home = driver.findElement(By.name("q"));
		home.sendKeys("Curso Java");
		home.submit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		assertEquals(false, false);
	}
}
