package es.panel.curso.java.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Execution(ExecutionMode.CONCURRENT)

@Epic("Alumno Tests Epic")
@Feature("Super Features")
class AppTest extends BaseTest {

	@Test
	void testConstructorAlumno() {

		capa.writeInputWithLocatorAndTextWithotSubmit(By.id("departure"), "Madrid");
		capa.writeInputWithLocatorAndTextWithotSubmit(By.id("arrival"), "Ibiza");
		capa.clickInputWithLocator(By.xpath("//ul[@class='dropdown-menu open']//span[@class='lighted']"));
		insertaFechaIda("30/09/2019");

		// //ul[@class='dropdown-menu
		// open']//li[@class='selected']//span[@class='lighted']

		/*
		 * (//span[@class='number'])[3]
		 *
		 */

		Utilidades.sleepTimeInSegundos(10);
		assertEquals(false, false);
	}

	public void insertaFechaIda(String ida) {
		String resultado = Utilidades.getMesAnyo(ida);
		String mesActual = "";

		boolean encontrado = false;
		while (!encontrado) {
			mesActual = capa
					.getElement(By.xpath("//div[@class='datepicker-week-wrapper right']/p[@class='datepicker-month']"));

			if (mesActual.equals(resultado)) {
				encontrado = true;
			}

			if (!encontrado) {
				capa.clickInputWithLocator(By.xpath("//span[@class='datepicker-controls-next']"));
			}
		}

		String xpathExpression = "//div[@class='datepicker-week-wrapper right']//div[contains(string(), \""
				+ Utilidades.getDia(ida)
				+ "\") and not(contains(@class,'unavailable')) and not(contains(@class,'days'))]";
		capa.clickInputWithLocator(By.xpath(xpathExpression));
	}
}
