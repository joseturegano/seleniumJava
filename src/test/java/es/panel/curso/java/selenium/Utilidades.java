package es.panel.curso.java.selenium;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.text.WordUtils;

public class Utilidades {
	
	public static void sleepTimeInSegundos(int segundos) {
		try {
			Thread.sleep(5 *1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int getDia(String fechaIda) {
		DateTimeFormatter locaFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate inputDate = LocalDate.parse(fechaIda, locaFormat);
		
		return inputDate.getDayOfMonth();
		
	}
	
	
	public static String getMesAnyo(String fechaIda) {
		String resultado= "";
		DateTimeFormatter locaFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate inputDate = LocalDate.parse(fechaIda, locaFormat);
			
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
		String formattedLocalDate = inputDate.format(formatter);
		
		resultado= WordUtils.capitalize(formattedLocalDate);
		return resultado;
	}

}
