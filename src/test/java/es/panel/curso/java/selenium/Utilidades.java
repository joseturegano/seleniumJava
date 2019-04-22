package es.panel.curso.java.selenium;

public class Utilidades {
	
	public static void sleepTimeInSegundos(int segundos) {
		try {
			Thread.sleep(5 *1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
