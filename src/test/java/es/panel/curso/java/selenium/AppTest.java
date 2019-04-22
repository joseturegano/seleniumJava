package es.panel.curso.java.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Execution(ExecutionMode.CONCURRENT)

@Epic("Alumno Tests Epic")
@Feature("Super Features")
class AppTest {

	private WebDriver driver;
	private CapaTecnica capa;
	
	@BeforeEach
	public void initEach(){
		System.setProperty("webdriver.chrome.driver", "D:\\ENVIRONMENT\\selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/xhtml");
		capa = new CapaTecnica(driver);
	}

	@Test
	void testConstructorAlumno() {
		capa.writeInputWithLocatorAndText(By.name("q"), "Curso Java");
		Utilidades.sleepTimeInSegundos(5);
		assertEquals(false, false);
	}
	
	@AfterEach
	public void endEach(){
		driver.quit();
	}
}
