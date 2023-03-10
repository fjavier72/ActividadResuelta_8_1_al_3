package com.cursoceat.model;

public class HoraExacta extends Hora {

	private int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if (!setSegundos(segundos))
			System.out.println("Los segundos dados no son correctos.\nSe aplicará el valor 0 por defecto");
	}

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {
		boolean correcto;
		
		if (segundos < 0 || segundos > 59)
			correcto = false;
		else {
			this.segundos = segundos;
			correcto = true;
		}
		
		return correcto;
	}
	
	
	
}
