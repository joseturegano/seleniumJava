package es.panel.curso.java.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Execution(ExecutionMode.CONCURRENT)

@Epic("Alumno Tests Epic")
@Feature("Super Features")
class BaseTest {

	protected WebDriver driver;
	protected CapaTecnica capa;
	
	@BeforeEach
	public void initEach(){
		System.setProperty("webdriver.chrome.driver", "D:\\ENVIRONMENT\\selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.aireuropa.com");
		capa = new CapaTecnica(driver);
	}
	
	@AfterEach
	public void endEach(){
		driver.quit();
	}
}
